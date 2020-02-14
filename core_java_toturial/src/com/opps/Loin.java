package com.opps;

public class Loin implements Animals,ZooAnimals {

	@Override
	public void move() {
		System.out.println("loins move vary fast wiht four legs");

	}

	@Override
	public void eat() {
		System.out.println("lions eats meat....");

	}

	@Override
	public void hunt() {
		System.out.println("loins hunts any animal in the planet...");

	}

	@Override
	public void isDangerous() {
		System.out.println("loins are the most dangrouse animals in the world");
		
	}

	@Override
	public void whicCountenentisFrom() {
		System.out.println("they are mostly from Africa and Amarica");
		
	}

}
