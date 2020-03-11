package com.polymorphism;

public class GitHub {

	String name;
	int id;
	int age;

	public GitHub(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public static void main(String[] args) {

		GitHub OBJECT = new GitHub("kamal", 1, 20);

		System.out.println(OBJECT.name);
		System.out.println(OBJECT.id);
		System.out.println(OBJECT.age);

	}

}
