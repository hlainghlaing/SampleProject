package com.scm.inheritance.sample;

public class Train extends Machine {

    @Override
    public void engineStart() {
        System.out.println("Train Engine Started");
    }

    @Override
    public void engineStop() {
        System.out.println("Train Engine Stoped");
    }
}
