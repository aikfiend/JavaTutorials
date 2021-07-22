package com.tutorial;

// Inheritor class
public class Professor extends Human {
    String degree;

    public Professor(String name, int age, String institution) {
        super(name, age, institution);
    }

    Professor introduction() {
        System.out.format("Hello, my name is %s, my age is %s and I am the %s professor.\n", name, age, institution);
        return this;
    }
}