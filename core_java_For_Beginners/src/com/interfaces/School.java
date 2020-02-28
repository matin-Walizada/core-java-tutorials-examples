package com.interfaces;

public interface School{
	
	// we can create variables and methods inside interface
	
	// we cant create object of interface
	// interfaces dont have constructor
	
	// one interface can extends multiple interfaces 
	
	void classRoom1();
	void classRoom2();
	
	default void play() {
		System.out.println("I AM A DEFAULT METHOD");
	}
	
	static void schoolTime() {
		System.out.println("your school time is 7:00 am");
	}
	
	

}
