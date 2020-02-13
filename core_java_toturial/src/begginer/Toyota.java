package begginer;

public class Toyota {

	// golabel // instance varibles
	
	// we access golobal varibals values through object
	
	String tire = "54 japani";
	String color = "black";
	String lights = "Shekari";
	static int age = 20;
	int a = 100;
	
	// static varibales 
	static String doors = "4 door";
	
	int familyPhoneNumber = 2020;
	
	static int  myPhoneNumber = 4040;
	
		public int sum() {
		// local variable
		int a = 100;
		int b = 200;
		
		  
		return b + a;
		
	}
	

	
	
	public static void main(String[] args) {
		// sayntax of object 
		// name of class + a name + = + new + nameofClss or constructor name();
		Toyota ab = new Toyota();
		
		System.out.println(ab.sum());
		
		System.out.println(" My age is : "  + Toyota.age);
		System.out.println(ab.a);
		
		
		
		Toyota b = new Toyota();
		Toyota C = new Toyota();
 		
		
		
		System.out.println(b.familyPhoneNumber);
		// accessing 
		
		// one accessing 
		System.out.println(b.tire);
		System.out.println(b.color);
		System.out.println(b.lights);
		
		// 3 way accessing 
		System.out.println(b.doors);
		System.out.println(Toyota.doors);
		System.out.println(doors);
		
// invoking // calling 
		System.out.println(ab.sum());
		System.out.println(b.sum());
		
		String myName = "Ahmad";
		System.out.println(myName);
		
		
	}

}
