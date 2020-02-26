package com.inheritance.java;

public class Lion extends Animal {

	String name;
	String lifeSpan;
	

	
	

	
	public Lion(String animalLivingAre, String animalColor, String name, String lifeSpan) {
		
		super(animalLivingAre, animalColor);
		
		this.name = name;
		this.lifeSpan = lifeSpan;
	}






	@Override
	public String toString() {
		return "Lion [name=" + name + ", lifeSpan=" + lifeSpan + ", livingAear=" + livingAear + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}






	public static void main(String[] args) {
		
		Lion theLion = new Lion("Africa", "yellow", "Loin", "20 year");
		
		System.out.println(theLion.toString());
		theLion.hunt();
		

	}

}
