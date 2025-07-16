package com.school;

public class Student {
    int studentId;
    String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void setDetails(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}