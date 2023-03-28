package com.scm.inheritance.sample;

public class Car extends Machine {

    @Override
    public void engineStart() {
        System.out.println("Car Engine Started");
    }

    @Override
    public void engineStop() {
        System.out.println("Car Engine Stoped");
    }
}
