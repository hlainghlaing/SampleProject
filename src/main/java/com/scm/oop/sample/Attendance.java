package com.scm.oop.sample;

public class Attendance {

    public static void main(String[] args) {

        // declare & instantiate Object using default Constructor
        Student student1 = new Student();
        student1.setStudentID(4958);
        student1.setStudentName("Ma Ma");
        student1.setStudentEmail("mama@gmail.com");
        student1.setStudentRollNo(1);

        // declare & Instantiate Object using Constructor with parameter
        Student student2 = new Student(4053, "Mg Mg", 2, "mgmg@gmail.com");

        student1.callMethod();
        System.out.println();
        student1.getStudentInfo(student1);
        System.out.println();
        student2.getStudentInfo(student2);

        // Using static variable
        Student.phoneNum = "09-777777777";
        Student.showPhoneNumber();

        Student student3 = showInfo();
        System.out.println("Encapsulation Obj Email " + student3.getStudentEmail());
    }

    public static Student showInfo() {
        // declare & Instantiate Object
        Student student = new Student();

        student.setStudentID(2456);
        student.setStudentName("Zaw Zaw");
        student.setStudentEmail("zawzaw@gmail.com");
        student.setStudentRollNo(3);

        return student;// Encapsulation single unit all information
    }

}
