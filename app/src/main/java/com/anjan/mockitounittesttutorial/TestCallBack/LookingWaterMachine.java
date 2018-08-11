package com.anjan.mockitounittesttutorial.TestCallBack;

public class LookingWaterMachine  implements WaterFullCallback{

    RunWaterMachine runWaterMachine;
    String stop;

    public  LookingWaterMachine(RunWaterMachine runWaterMachine) {
        this.runWaterMachine=runWaterMachine;

    }

    public void lookWaterMachine(){
        runWaterMachine.runWaterMachine(this);
    }


    public String getResult(){
        return  this.stop;
    }

    @Override
    public void FullWater(String stop) {
        this.stop=stop;

    }
}
