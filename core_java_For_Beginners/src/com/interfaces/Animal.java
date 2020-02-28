package com.interfaces;

public interface Animal {
	
	default void sound() {
		System.out.println("this is default method");
		
		
	}

	
	static void eat() {
		System.out.println("this static method");
		
	}
}
