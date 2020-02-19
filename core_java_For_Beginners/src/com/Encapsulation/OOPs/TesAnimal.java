package com.Encapsulation.OOPs;

public class TesAnimal {

	public static void main(String[] args) {
		
		// we created the object of animal class inside TestAnimal class
		//to assinge some value to it's variabls and print them
		
		Animal myanimal = new Animal();
		
		
		
		myanimal.setName("lion");
		myanimal.setWight(350);
		myanimal.setNumberOfLeags(4);
		
		System.out.println(myanimal.getName());
		System.out.println(myanimal.getWight() + " kg");
		System.out.println(myanimal.getNumberOfLeags() + " legs");

	}
}
