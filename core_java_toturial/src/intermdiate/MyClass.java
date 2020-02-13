package intermdiate;

public class MyClass {
	
	String name;
	int age;
	String address;
	
	static String shoolName = "Bakhtar high school";
	
	

	public MyClass(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}


	@Override
	public String toString() {
		return "MyClass [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		
	 MyClass obj = new MyClass("Ahamad", 23, "MAZAR");
	 
	 System.out.println(obj);
	 System.out.println(shoolName);
	 
	 System.out.println("================\n");
	 
	 
	 MyClass obj1 = new MyClass("Kamal", 40, "Mazar");
	 System.out.println(obj1);
	 System.out.println(shoolName);
	 
		
		
		
		
		

	}
	
	
		

}
