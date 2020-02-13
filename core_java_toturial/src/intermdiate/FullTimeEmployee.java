package intermdiate;

public class FullTimeEmployee extends MyCompanyEmployee {
	
	public int hourlyWorking;
	
	
	public FullTimeEmployee(String name, int hourlyworkingPayment, int extraHourlyWorkingPament, int hourlyWorking) {
		super(name, hourlyworkingPayment, extraHourlyWorkingPament);
		this.hourlyWorking = hourlyWorking;
	}


	@Override
	public int caculateSalary() {
	 
		return getHourlyworkingPayment() * 8;
	}
	
	
	
	public String toString() {
		
		return " Name " + getName() + "\nHourly Working " + hourlyWorking + "\nHourly working payment " 
		+ getHourlyworkingPayment() +    "\nExtra Hourly working payment  "+  getExtraHourlyWorkingPament() +"\n total payment " + caculateSalary();
	}
	
	
	public static void main(String[] args) {
		
		FullTimeEmployee obj = new FullTimeEmployee("Ahmad ", 10, 0, 8);
		
		
		System.out.println(obj);
		
		System.out.println("=================\n");
	FullTimeEmployee obj1 = new FullTimeEmployee("Kamal ", 12, 0, 8);
		
		
		System.out.println(obj1);
		 
		 
		
	}
	
	
	
	
	

}

 