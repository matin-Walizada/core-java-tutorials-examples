package intermdiate;

public class Employee {
	
	public String empName;
	public int empSallary;
	public String emplAddress;
	
	// chaining constructor
	public Employee() {
		this("Hamid", 2000, "SAMIM");
		
	}

	public Employee(String name, int sal, String empAddress) {
	  
		this.empName = name;
		this.empSallary = sal;
		this.emplAddress = empAddress;
		
	}
 
	void getEmpInfo() {
		System.out.println(empName);
		System.out.println(empSallary);
		System.out.println(emplAddress);
	}

	public static void main(String[] args) {
 
		Employee obj = new Employee();
		
		obj.getEmpInfo();
		
		
		
		
				
				

	}

}
