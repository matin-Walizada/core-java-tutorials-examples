package com.interfaces;

public class Teachers implements School {

 
	public void classRoom1() {
	 System.out.println("teacher karim has a sission in classrom 1");

	}

	 
	public void classRoom2() {
		
		System.out.println("teahcer kamal has sission in classRoom 2");
		 

	}

	public static void main(String[] args) {
		
		School teacher = new Teachers();
		
		teacher.classRoom1();
		teacher.classRoom2();
		teacher.play();
		School.schoolTime();
		
	}

}
