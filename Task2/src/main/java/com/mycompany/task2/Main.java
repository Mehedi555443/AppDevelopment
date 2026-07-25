package com.mycompany.task2;


public class Main {
    public static void main(String[] args) {

        University university = new University("DIU", "Dhaka");
        Student student = new Student("Rahim", 101);
        Department department = new Department("Computer Science", "Karim");

        System.out.println("University Information");
        university.displayUniversity();

        System.out.println("\nStudent Information");
        student.displayStudent();

        System.out.println("\n Department Information ");
        department.displayDepartment();
    }
}