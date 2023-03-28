package com.scm.abstractsample;

public abstract class Machine {

    public abstract void start();

    public abstract void stop();

    public void showInfo() {
        System.out.println("I am machine.");
    }
}
