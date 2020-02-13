package com.variables;

public class VariablesExamples {
	
	//completor element of class
	
	//acccess modifers 
	// data type
	// variables
	// method();
	//constructor()
	// object
	


	public static void main(String[] args) {
		
		// how create object?
		// nameof our class + aname + = + new + constructor();
		
		VariablesExamples object = new VariablesExamples();
		
		System.out.println(object.car);
		System.out.println(object.age);
		System.out.println(object.cellphone);
		System.out.println(object.telphone);
		
		System.out.println("===============================\n");
		
		System.out.println(yourphone);
		System.out.println(lastName);
		System.out.println(shoeNumber);
		
		System.out.println("=================================\n");
		// calling method or invoking method
		System.out.println(object.sum());
		
		
	}
	
	//We have three types of variables in java:
	
	//1  Instance variable, 
	// how to access value of instance variabls 
	// to acces instance variables values we  createt object.
	public String car = "toyota";
	private int age = 27;
	int cellphone;
	short telphone = 343;
	
	//2 static variable or global variables
	// how to access value of static variables?
	// we can acess directly the value of static variables
	public static int yourphone = 23234;
	static String lastName = "khawari";
    static private int shoeNumber = 8;
	
	//3 local variables are created inside method();
    
    // how access value of local variables?
    // we can access value of local variables by callng method name();
    public int sum(){
    	
    	int a = 10;
    	int b = 20;
    	
    	return a + b;
    
    }
	
    
	


}
