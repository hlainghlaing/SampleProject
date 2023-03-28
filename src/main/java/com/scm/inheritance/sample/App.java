package com.scm.inheritance.sample;

public class App {

    public static void main(String[] args) {
        // Declare & Instantiate MotorBike Object

        MotorBike motorbike = new MotorBike();
        motorbike.engineStart();
        motorbike.engineStop();

        // Declare & Instantiate Car Object
        Car car = new Car();
        car.engineStart();
        car.engineStop();

        // Declare & Instantiate Train Object
        Train train = new Train();
        train.engineStart();
        train.engineStop();

        // Upcasting testing
        Machine mac = (Machine) train;
        System.out.println("Upcasting Output in Machine Object");
        mac.engineStart();
        mac.engineStop();

    }

}
