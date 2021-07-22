package com.tutorial;

import java.util.Scanner;

public class Fauna {
    public static void main(String[] args) {
        Beetle beetle = new Beetle();
        System.out.format("I am a beetle, but my name is %s, please give me a name.\n", beetle.name);
        System.out.print("Name: ");
        Scanner scanner = new Scanner(System.in);
        beetle.name = scanner.next();
        System.out.format("Now my name is %s, thank you.\n", beetle.name);
    }
}
