package com.tutorial;

public class DataTypes {
    // Primitive data types

    // Whole numbers
    byte aByte;
    short aShort;
    int anInt;
    long aLong;

    // Floating point numbers
    double aDouble;
    float aFloat;

    // Symbols
    char aChar;

    // Boolean
    boolean aBoolean;

    // Non-primitive data types
    // String (object) points that aString will be a char data type, that means that inside aString it will be stored an
    // array (set) of symbols
    String aString;

    void printDefaultValues() {
        System.out.println("Default value for byte: " + aByte);
        System.out.println("Default value for short: " + aShort);
        System.out.println("Default value for int: " + anInt);
        System.out.println("Default value for long: " + aLong);
        System.out.println("Default value for double: " + aDouble);
        System.out.println("Default value for float: " + aFloat);
        System.out.println("Default value for char: " + String.format("\\u%04x", (int) aChar));
        System.out.println("Default value for boolean: " + aBoolean);
        System.out.println("Default value for String: " + aString);
    }
}