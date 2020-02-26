package com.inheritance.java;

public class Sparrow extends Bird {
	String name = "Sparrow";
	String color = "gray";
	

	public static void main(String[] args) {
		Sparrow theSparrow = new Sparrow();
		System.out.println(theSparrow.name);
		System.out.println(theSparrow.color);
		System.out.println(theSparrow.prodcut);
		System.out.println(theSparrow.outerCovering);
		theSparrow.flyDown();
		theSparrow.flyDown();
		

	}

}
