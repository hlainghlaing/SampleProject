package com.scm.abstractsample;

public class Main {

    public static void main(String[] args) {

        // Machine cannot instantiate Obj By itself / References to Child Class
        Machine mac1 = new Car();
        mac1.start();
        mac1.stop();
        mac1.showInfo();

        Machine mac2 = new Camera();
        mac2.start();
        mac2.stop();
        mac2.showInfo();
    }

}
