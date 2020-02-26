package com.inheritance.java;

public class B extends A {

	int num = 200;
	public void show() {
		System.out.println("I AM child class method");
	}
	
	public void ShoInfo() {
		System.out.println(super.num);
		super.show();
	}
	
	
	public static void main(String[] args) {
		
		B theB = new B();
		
		System.out.println(theB.num);
		theB.show();
		
		
		theB.ShoInfo();
		

	}

}