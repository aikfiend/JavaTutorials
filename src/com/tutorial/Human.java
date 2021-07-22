package com.tutorial;

// Superclass
public class Human {
    private static final String biologicalSpecie = "Human";
    static int numberOfObjects = 0;

    protected String name;
    protected String institution;
    protected int age;

    public Human(String name, int years, String institution) {
        this.name = name;
        age = years;
        this.institution = institution;
        numberOfObjects++;
    }

    public Human() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void isAdult() {
       if (age > 18) {
           System.out.println("I am an adult.");
       } else {
           System.out.println("I am not an adult.");
       }
    }

    static void isHuman() {
        System.out.format("Also, I am a %s.\n", biologicalSpecie);
    }
}