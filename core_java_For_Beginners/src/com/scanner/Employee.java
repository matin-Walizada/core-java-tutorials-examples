package com.scanner;

import java.util.Scanner;

public class Employee {
// if you want to use scanner class you hvae ot create the object of the scanner class in your class
	
	
	public static void main(String[] args) {

		Scanner theScanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String yourName = theScanner.nextLine();
		
		System.out.println("your name is " + yourName );
		
		System.out.println("Enter your last Name");
		
		String yourlastName = theScanner.nextLine();
		
		System.out.println("your last name is " +yourlastName );
		
		System.out.println("enter your age");
		
		int yourAge = theScanner.nextInt();
		
		System.out.println("your age is " + yourAge);
		
		if(yourAge > 30) {
			System.out.println("your are able to player soccer profissnal still like RONALDO");
		}if(yourAge < 15  ) {
			System.out.println("you cant play in best clubs in the world");
		}
		
		
		
		

	}

}
