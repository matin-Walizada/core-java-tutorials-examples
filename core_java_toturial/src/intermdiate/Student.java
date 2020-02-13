package intermdiate;

import java.util.ArrayList;

public class Student {

	public String name;
	public int age;
	public int phone;
	
	Address studentAddress;
	
	
	 
	
	public Student(String name, int age, int phone, Address studentAddress) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.studentAddress = studentAddress;
	
	}
	
	 public String toString() {
		return  " State: " +  studentAddress.state + " City: " 
	 + studentAddress.city+ " Apartment: " + studentAddress.aptNumber
	 + " Name: " + name + " Age: " + age + " Phone: " + phone;
		
	}
	
	public static void main(String[] args) {
 
		Address stAdress = new Address("New York", "Albany", 5);
		
		Student student = new Student("Kamal", 20, 34040304, stAdress);
		
		System.out.println(student);
		
		
	} 
}
