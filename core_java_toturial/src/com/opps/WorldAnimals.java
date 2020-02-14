package com.opps;

public class WorldAnimals {

	public static void main(String[] args) {

		Animals hourses = new Horses();
		
		hourses.move();
		hourses.eat();
		hourses.hunt();
		
		Horses myHorss = new Horses();
		myHorss.isDangerous();
		myHorss.whicCountenentisFrom();
		
		
		System.out.println("======================================\n");
		
		Animals bigLoins = new Loin();
		bigLoins.move();
		bigLoins.eat();
		bigLoins.hunt();
		
		Loin theLoin = new Loin();
		theLoin.isDangerous();
		theLoin.whicCountenentisFrom();
		
		
		
	}

}
