package com.mycompany.task2;


class Student {
    String studentName;
    int studentId;

    Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    void displayStudent() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
    }
}