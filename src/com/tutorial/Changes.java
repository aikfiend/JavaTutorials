package com.tutorial;

public class Changes {
    static CivilRegistry civilRegistry = new CivilRegistry();

    public static void main(String[] args) {

        Student collegeStudent = new Student("Dorian", 18, "College");
        Professor collegeProfessor = new Professor("Simon", 60, "College");

        // Object as method argument
        System.out.format("Who want to change the name? %s.", collegeStudent.name);
        civilRegistry.changeName(collegeStudent);
        System.out.format("Congratulations, you got the new name, %s.\n", collegeStudent.name);

        System.out.println();

        // Primitive as method argument
        System.out.format("%s age is %s.\n", collegeStudent.name, collegeStudent.age);
        civilRegistry.flushAge(collegeStudent.age);
        System.out.format("%s age is still %s.\n", collegeStudent.name, collegeStudent.age);

        System.out.println();

        System.out.format("%s age is %s.\n", collegeProfessor.name, collegeProfessor.age);
        civilRegistry.flushAge(collegeProfessor.age);

        System.out.println();
        civilRegistry.changeId(collegeProfessor);
        System.out.format("Congratulations, you got the new Id, %s.\n", collegeProfessor.name);
    }
}
