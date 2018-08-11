package com.anjan.mockitounittesttutorial.TestCallBack;

public class RunWaterMachine {

    public void runWaterMachine(final WaterFullCallback waterFullCallback){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    waterFullCallback.FullWater("Stop");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
}
