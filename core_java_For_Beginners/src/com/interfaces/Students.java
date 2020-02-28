package com.interfaces;

public class Students implements School {


	public void classRoom1() {
		
		System.out.println("all first grade students are in classromm 1");
		

	}


	public void classRoom2() {
		
		System.out.println("all seconde grade students are in classroom 2");
	}



	public static void main(String[] args) {
		
		Students theStudents = new Students();
		
		theStudents.classRoom1();
		theStudents.classRoom2();
		
	}

}
