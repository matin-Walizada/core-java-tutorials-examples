package intermdiate;

public class ChildClass extends ConstructorInheretance {

	int salary;
	String address;
	
	
	public ChildClass(String name, int age, int salary, String address) {
		super(name, age);
		this.salary = salary;
		this.address = address;
	}


	





	@Override
	public String toString() {
		return "ChildClass [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}








	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass("Ahmad", 27, 300, "VA");
		
		System.out.println(obj);
		

	}

}
