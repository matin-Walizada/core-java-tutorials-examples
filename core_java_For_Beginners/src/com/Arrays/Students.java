package com.Arrays;

import java.util.*;

public class Students {
	
	
	
	

	public static void main(String[] args) {
		
		
			ArrayList<String> employees = new ArrayList<String>();
			
			

			employees.add("Shabana");
			employees.add("Kambiz");
			employees.add("Samira");
			employees.add("Shabnam");
			
			System.out.println(employees);
			
			employees.remove("Kambiz");
			
			System.out.println(employees);
			
			employees.remove(2);
			
			System.out.println(employees);
			
			
		
		ArrayList<String> managers = new ArrayList<String>();
		
		
		managers.add("Kamal");
		managers.add("Sohila");
		
		
		// adding managers list to employee list
		
		
		employees.addAll(managers);
		
		System.out.println(employees);
		
		employees.removeAll(managers);
		
		System.out.println(employees);
		
		
		//cleared all the elements of employees array using clear() method
		employees.clear();
		
		System.out.println(employees);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
