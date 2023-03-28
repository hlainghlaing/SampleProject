package com.scm.oop.sample;

public class Student {
    private int studentID;
    private String studentName;
    private int studentRollNo;
    private String studentEmail;
    static String phoneNum;

    public Student() {
    }

    public Student(int studentID, String studentName, int studentRollNo, String studentEmail) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.studentEmail = studentEmail;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void callMethod() {
        System.out.println(" Hey! You are calling using me using Student Object.");
    }

    public void getStudentInfo(Student student) {
        System.out.println("Student ID : " + student.getStudentID());
        System.out.println("Student Name : " + student.getStudentName());
        System.out.println("Student Roll No : " + student.getStudentRollNo());
        System.out.println("Student Email : " + student.getStudentEmail());
    }

    public static void showPhoneNumber() {
        System.out.println("Phone Number is " + phoneNum);
    }

}
