package com.opps;

public class AllAnimalsinfo {

	public static void main(String[] args) {
		// this fish class object with refrence name of animal class
		Animal fishes = new Fish();
		
		fishes.move();
		fishes.eat();
		fishes.hunt();
		fishes.animalsinfo();
		
		System.out.println("==========================\n");
		
		
		// this Cat class object with refrence name of Animal class
		
		Animal cats = new Cat();
		
		cats.move();
		cats.eat();
		cats.hunt();
		cats.animalsinfo();
		
		System.out.println("=======================\n");
		
		// this Eagle class object with refrence name of Animal class
		
		Animal eagls = new Eagl();
		
		eagls.move();
		eagls.eat();
		eagls.hunt();
		eagls.animalsinfo();
		

	}

}
