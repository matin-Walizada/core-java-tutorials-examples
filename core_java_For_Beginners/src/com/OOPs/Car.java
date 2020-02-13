package com.OOPs;

public class Car {
	//variabls
	
	String color;
	String name;
	String model;
	
	
	// paramtrized constructor

	public Car(String carcolor, String carname, String carmodel ) {
		
		this.color = carcolor;
		this.name = carname;
		this.model = carmodel;
	}

	public static void main(String[] args) {
		
		
		// OBJEC CREATE 
		
		Car FORD2019 = new Car("RED", "FORD", "MUSTING");
		
		System.out.println(FORD2019.color);
		System.out.println(FORD2019.name);
		System.out.println(FORD2019.model);
		
		System.out.println("==========================\n");
		
		Car jeep2020 = new Car("black", "jeep runner", "jSPD");
		
		System.out.println(jeep2020.color);
		System.out.println(jeep2020.name);
		System.out.println(jeep2020.model);
		
		
		

	}


}
