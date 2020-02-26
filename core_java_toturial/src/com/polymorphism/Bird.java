package com.polymorphism;

public class Bird {
// method overloading is a kind of  polymorphism
	
	public void fly() {
		System.out.println("all birds at least could fly 100 feet high");
	}
	
	public void fly(int high) {
		System.out.println("this type of birds could fly " + high + " feet");
	}
	
	public void fly(String name, int high) {
		System.out.println("the " + name + " can fly " + high + " feet high alsmost higher than any birds" );
	}
	
	
	public static void main(String[] args) {
		
	
		Bird theBird = new Bird();
		
		theBird.fly();
		theBird.fly(7000);
		theBird.fly("Eagle ", 10000);
		
		
		
		
		
		
		
		

	}

}
