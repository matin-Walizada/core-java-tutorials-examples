package intermdiate;

public class SunClass extends SuperClass {
	String address;
	int phone;
	String name = "kamal";
	public SunClass(String name, int age, String address, int phone) {
		super(name, age);
		
		this.address = address;
		this.phone = phone;
	}

void sum() {
	System.out.println(" I AM FORM CHILD CLASSS");
}


void bothMethods() {
	
	sum();
	super.sum();
	
	 
}

public String toString() {
	return super.name;
}




	public static void main(String[] args) {
		
		SuperClass obj = new SunClass("Samim", 20, "Mazar", 342234);
		System.out.println(obj.name);
		System.out.println(obj.age);
	 
		System.out.println(obj.name);
		 System.out.println(obj.toString());
	}

}
