package com.polymorphism;

public class Loin extends Animal {
	
	// method overriding is a type of polymorphism
	
	@Override
 public void eat() {
		System.out.println("Lions eat meat and hunt for food");
	}

	public static void main(String[] args) {
		
		Animal theAnimal = new Animal();
		theAnimal.eat();
		
		Loin theLoin = new Loin();
		theLoin.eat();
		
		
		
	}
	
	
	
	
	
	
	

}
