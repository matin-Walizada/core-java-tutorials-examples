package com.Encapsulation.OOPs;

public class Animal {

	// these variables are private fields we can't accesses them directly from
	// outside of this class.
	// the only way to access these variables is through their getter and setter
	// methods

	private String name;
	private int wight;
	private int numberOfLeags;

	// with this method we can access the value of name variabl
	public String getName() {
		return name;
	}

	// with this method we assign a value to name variable
	public void setName(String animalName) {
		name = animalName;
	}

	public int getWight() {
		return wight;
	}

	public void setWight(int animalWight) {
		wight = animalWight;
	}

	public int getNumberOfLeags() {
		return numberOfLeags;
	}

	public void setNumberOfLeags(int numberOfLeags) {
		this.numberOfLeags = numberOfLeags;
	}
	
	
	

}
