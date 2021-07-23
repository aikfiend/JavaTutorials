package com.javatutorials;

import java.util.Scanner;

public class CivilRegistry {
    void changeName(Human human) {
        System.out.print("\nEnter a new name: ");
        Scanner scanner = new Scanner(System.in);
        human.name = scanner.next();
    }

    void flushAge(int age) {
        System.out.println("Trying to flush the age ...");
        if (age <= 18) {
            age = 0;
        } else {
            System.out.println("Sorry, the age can not be flushed.");
        }
    }

    void changeId(Human human) {
        System.out.format("Trying to change the Id for %s ...", human.name);
        if (human.age > 18) {
            // Calling one method from another one
            changeName(human);
        } else {
            System.out.println("Sorry, the Id can not be changed.");
        }
    }
}