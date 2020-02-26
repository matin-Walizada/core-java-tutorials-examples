package com.inheritance.java;

public class Eagle extends Bird {
 
	String name = "Eagle";
	int lifeSpan = 15;
	
	public static void main(String[] args) {
		
		// we should create object of Eagle class
		Eagle theEagle = new Eagle();
		System.out.println(theEagle.name);
		System.out.println(theEagle.lifeSpan);
		System.out.println(theEagle.prodcut);
		System.out.println(theEagle.outerCovering);
		theEagle.flyUp();
		theEagle.flyDown();
		

	}

}
