package com.mycompany.task2;


class University {
    String universityName;
    String location;

    University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    void displayUniversity() {
        System.out.println("University Name: " + universityName);
        System.out.println("Location: " + location);
    }
}