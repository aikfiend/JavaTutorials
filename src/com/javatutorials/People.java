package com.javatutorials;

public class People {

    public static void main(String[] args) {

    	Student highSchoolStudent = new Student("Alice", 17, "High School");

    	// In universityStudent it is stored the memory address allocated while doing new Student("Jimmy", 22, "University");
		Student universityStudent = new Student("Jimmy", 22, "University");
		universityStudent.specialization = "Computer Science";

		Professor universityProfessor = new Professor("Ryan", 40, "University");
		universityProfessor.degree = "PhD in Engineering Science";

		System.out.println(highSchoolStudent.getName());
		System.out.println(highSchoolStudent.getAge());
		System.out.println(highSchoolStudent.getSpecialization());
		highSchoolStudent.introduction().isAdult();
		Human.isHuman();

		System.out.println();

		System.out.println(universityStudent.name);
		System.out.println(universityStudent.age);
		System.out.println(universityStudent.getSpecialization());
		universityStudent.introduction().isAdult();
		Human.isHuman();

		System.out.println();

		double avgAge = (double) (highSchoolStudent.getAge() + universityStudent.getAge()) / Student.numberOfObjects;
		System.out.format("Average student age: %s.\n", avgAge);

		System.out.println();

		System.out.println(universityProfessor.getName());
		System.out.println(universityProfessor.getAge());
		System.out.println(universityProfessor.degree);
		universityProfessor.introduction().isAdult();
		Human.isHuman();

		System.out.println();

		System.out.format("Total people: %s.\n", Human.numberOfObjects);
	}
}

//	    Scanner sc = new Scanner(System.in);
//	    String scanned = sc.next();
//		//String scanned = sc.nextLine();
//	    int w = Integer.parseInt(scanned);
//		// int scanned = sc.nextInt();
//		// boolean scanned = sc.nextBoolean();
//		// double scanned = sc.nextDouble();
//
//		// primitive data types
//	    int x = 3;
//	    int d = 7;
//	    double y = 10.0;
//	    double z = y / x;
//	    double b = d / (double)x;
//	    int a = d % x;
//
//	    // || ()
//	    boolean comp1 = !(x > y && x != y);
////	    char c = '&';
//	    double p = Math.pow(x, y);
//
//	    // non-primitive data types
//	    String str1 = "test";
//	    String str2 = "test";
//
//	    double yy = y;
//	    boolean comp2 = str1.equals(str2);

	    /*if () {
	    	;
	    	if () {
	    		;
	    	}
	    	else {
	    		;
	    	}
		}
	    else if () {
	    	;
	    }
	    else {
	    	;
		}*/

//		int[] newArr = new int[5];
//		newArr.length();

//		for (int element:newArr) {
//
//		}

//		Set<Integer> t = new HashSet<Integer>();
//		t.add();
//		t.remove();
//		t.clear();
//		t.isEmpty();
//		t.size();
//		t.contains();
//
//		ArrayList<Integer> f = new ArrayList<Integer>();
//		f.add();
//		f.get(); //index
//		f.set();
//		f.subList();

//		System.out.println("Enter some number:");
//	    System.out.println(scanned);
//		System.out.println("Variables:");
//		System.out.println(w/4);
//		System.out.println(x);
//		System.out.println(c);
//	    System.out.println(comp1);
//		System.out.println(comp2);

	
