package com.polymorphism;

public class GitHub {

	String name;
	int id;
	int age;
	int salary;
	
	
	public GitHub(String name, int id, int age,int salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public static void main(String[] args) {

		GitHub OBJECT = new GitHub("kamal", 1, 20,20000);

		System.out.println(OBJECT.name);
		System.out.println(OBJECT.id);
		System.out.println(OBJECT.age);
		System.out.println(OBJECT.salary);

	}

}
