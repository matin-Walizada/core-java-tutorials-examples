package com.Data_types;

public class SwitchCaseExample2 {

	public static void main(String[] args) {
		
		
		
		// declared an array and instaniats array
		int apartmentNumbers[] = new int[4];
		
		// add elements to array
		apartmentNumbers[0] = 35;
		apartmentNumbers[1] = 50;
		apartmentNumbers[2] = 60;
		apartmentNumbers[3] = 90;
		
		// printing element of our array
		System.out.println(apartmentNumbers[3]);
		
		System.out.println("==========================\n");

		
		for(int i = 0; i <apartmentNumbers.length; i++ ) {
			
			System.out.println(apartmentNumbers[i]);
		}
		
		
		
		System.out.println("==========================\n");
		int number [] = new int[3];
		
		number[0] = 500;
		number[1] = 900;
		number[2] = 300;
		
		System.out.println(number[0]);
		
		System.out.println(number.length);
		
		
		System.out.println("==================\n");
	int a[] = {20,40,50,70};
	
	System.out.println(a[0]);
	System.out.println(a.length);
	
	 String names[] = {"Ahmad", "Samim", "jamil", "khan", "SHABANA", "Khatara"};
	 
	 System.out.println(names[4]);
	 System.out.println(names.length);
	 
	 // looping through all elements of array. printing all elements of array
	 System.out.println("==========forloop============\n");
	 	for(int i = 0; i < names.length; i++) {
	 		
	 		System.out.println(names[i]);
	 	}
	 
	 
	 	
	 	System.out.println("==========for each loop============\n");
	 	
	 	for(String n: names ) {
	 		
	 		System.out.println(n);
	 	}
	 	
	 	
	 	
	 	
	 	
	 	
		
		}
		
		
}
