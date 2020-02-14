package com.opps;


// this is an abstract class and abstract class always creates with abstract key word
public abstract class Animal {
	
	
	
	// these are abstracts methods, abstract methods creates with abstract key word without body. abstract methods dont have body;
	// why the abstract methods dont have body??????
		// becuz the they implements in other classes.
	
	public abstract void move();
	
	public abstract void eat();
	
	public abstract void hunt();
	
	// 0 -100
	public void animalsinfo() {
		
		System.out.println("All animals have eye");
	}
}

