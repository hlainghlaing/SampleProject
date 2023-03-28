package com.scm.abstractsample;

public class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("Camera Started!");
    }

    @Override
    public void stop() {
        System.out.println("Camera Stopped");
    }

}
