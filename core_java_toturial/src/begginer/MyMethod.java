package begginer;

public class MyMethod {
// 1 variables 
// 2 constructor 
// method
	
	int age;
	String name;
	int cell;
	
// 2 constructor
	// constructor is a block of code which initialize the newly created object
	// how to create a constructor?
	// parameters, arguments
	// parametrized constructor
	
	//
	MyMethod(int MyAge, String MyName, int Mycell){
		
		age = MyAge;
		name = MyName;
		cell = Mycell;
	
	}
	
	// nonaguments constructor
	
	public MyMethod() {
		
	}
	
// chainning constructors 
	
	public static void main(String[] args) {
		
		// object syntax => 
		
		// name of the class + a name + = + new + constructor();
		
		
	
		
		
		MyMethod a = new MyMethod(400, "samim", 404302);
		
		System.out.println(a.age);
		System.out.println(a.name);
		System.out.println(a.cell);
		 

		
		MyMethod b = new MyMethod(20, "Ahmad", 202020);
		
		System.out.println("My age is  " + b.age);
		System.out.println("My name is " + b.name);
		System.out.println(" My cell is " + b.cell);
		
		MyMethod c = new MyMethod(30, "Taman", 40000);
		
		System.out.print("\n");
		System.out.println(c.age);
		System.out.println(c.name);
		System.out.println(c.cell);
		

	}

}














































