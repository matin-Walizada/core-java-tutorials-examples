package com.inheritance.java;

public class Zagh extends Eagle {
	String name = "Zagh";
	String color = "Black";
	String livinArea = "Disert";
	
	
	public static void main(String[] args) {
		
		Zagh theZagh = new Zagh();
		System.out.println(theZagh.name);
		System.out.println(theZagh.color);
		System.out.println(theZagh.livinArea);
		System.out.println(theZagh.prodcut);
		System.out.println(theZagh.outerCovering);
		theZagh.flyUp();
		theZagh.flyDown();
		
		


	}

}
