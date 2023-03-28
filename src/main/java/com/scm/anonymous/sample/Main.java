package com.scm.anonymous.sample;

public class Main {
    public static void main(String[] args) {
        // Declare & Instantiate Person Object
        Person person = new Person();
        // Direct Output
        person.showInfo();

        // If you want to override method in Person, You need to create another class
        Person person2 = new Student();
        person2.showInfo();

        /**
         * Although u wanna override method in Person, Another way No need to create a
         * class is Writing anonymous class in its object
         */
        Person person3 = new Person() {
            @Override
            public void showInfo() {
                System.out.println("I am person in an anonymous class");
            }
        };
        person3.showInfo();

    }
}
