package com.mycompany.task2;

class Department {
    String departmentName;
    String departmentHead;

    Department(String departmentName, String departmentHead) {
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

    void displayDepartment() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Head of Department: " + departmentHead);
    }
}