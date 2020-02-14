package com.opps;

public class Horses implements Animals,ZooAnimals {
	
	
	@Override
	public void move() {
		System.out.println("horses moves by four legs");
	}
	
	
	@Override
	public void eat() {
		System.out.println("horses eat Grasses");
	}
	
	
	@Override
	public void hunt() {
		System.out.println("horses dont hunt, horse are use to hunt");
	}


	@Override
	public void isDangerous() {
		
		System.out.println("horses are very good animals if they are not the wild ones");
	
		
	}


	@Override
	public void whicCountenentisFrom() {
		System.out.println("Asian horses are small but they are very fast");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
