package com.anjan.mockitounittesttutorial.testcallback;


import com.anjan.mockitounittesttutorial.TestCallBack.LookingWaterMachine;
import com.anjan.mockitounittesttutorial.TestCallBack.RunWaterMachine;
import com.anjan.mockitounittesttutorial.TestCallBack.WaterFullCallback;
import com.anjan.mockitounittesttutorial.async.DummyCallback;
import com.anjan.mockitounittesttutorial.async.DummyCaller;
import com.anjan.mockitounittesttutorial.async.DummyCollaborator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TestCallback  {


    //region constants

    //endregion constants

    //region helper fields
    @Mock
    private RunWaterMachine runWaterMachineMock;

    //endregion helper fields

    LookingWaterMachine SUT;

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);
        SUT = new LookingWaterMachine(runWaterMachineMock);

    }

    @Test
    /**
     *  stubbing a method with a generic Answer
     *  since we need a callback to return immediately (synchronously),
     *  we generate an answer so when the method under test is called,
     *  the callback will be executed right away with the data we tell it to return.
     */
    public void test_doSomethingAsynchronously_usingDoAnswer() {
        //arrange
        //here we stub the result
        final String stop="Stop";
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {

                ((WaterFullCallback)invocation.getArguments()[0]).FullWater(stop);
                return null;
            }
        }).when(runWaterMachineMock).runWaterMachine(any(WaterFullCallback.class));
        //action
        SUT.lookWaterMachine();
        //assert
        verify(runWaterMachineMock).runWaterMachine(any(WaterFullCallback.class));
        assertThat(SUT.getResult(), is(equalTo(stop)));
    }
}
