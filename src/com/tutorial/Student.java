package com.tutorial;

// Inheritor class
public class Student extends Human {
    static int numberOfObjects = 0;

    String specialization;

    public Student(String name, int age, String institution) {
        super(name, age, institution);
        numberOfObjects++;
    }

    Student introduction() {
        System.out.format("Hello, my name is %s, my age is %s and I am the %s student.\n", name, age, institution);
        return this;
    }

    String getSpecialization() {
        if (specialization == null) {
            return "No specialization yet.";
        } else {
            return "Specialization is " + specialization + ".";
        }
    }
}