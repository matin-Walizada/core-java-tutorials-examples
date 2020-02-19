package com.Encapsulation.OOPs;

public class StudentsInfo {

	public static void main(String[] args) {
		
		Students theStudent = new Students();
		
		theStudent.setName("Kamal");
		theStudent.setId(1);
		theStudent.setAge(20);
		
		System.out.println(" Student Name: " + theStudent.getName());
		System.out.println(" Student ID: " +theStudent.getId());
		System.out.println(" Student AGE: " +theStudent.getAge());

	}

}
