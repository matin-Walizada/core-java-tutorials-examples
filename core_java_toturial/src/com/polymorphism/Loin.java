package com.polymorphism;

public class Loin extends Animal {
	
	// method overriding is a type of polymorphism
	
	@Override
 public String eat() {
		 return "Lions eat meat and hunt for food";
	}

	public String showInfo() {
		return super.eat();
	}
	
	
	public static void main(String[] args) {
		
 
		
		Loin theLoin = new Loin();
		System.out.println(theLoin.eat());
		
		System.out.println(theLoin.showInfo());
		
		
		
	}
	
	
	
	
	
	
	

}
