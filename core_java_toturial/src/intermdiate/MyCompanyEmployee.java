package intermdiate;

public abstract class MyCompanyEmployee {

	// private variables are created
	private String name;
	private int hourlyworkingPayment;
	private int extraHourlyWorkingPament;

	// constructor of the class is created
	public MyCompanyEmployee(String name, int hourlyworkingPayment, int extraHourlyWorkingPament) {

		this.name = name;
		this.hourlyworkingPayment = hourlyworkingPayment;
		this.extraHourlyWorkingPament = extraHourlyWorkingPament;
	}

	// abstract method is created
	public abstract int caculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHourlyworkingPayment() {
		return hourlyworkingPayment;
	}

	public void setHourlyworkingPayment(int hourlyworkingPayment) {
		this.hourlyworkingPayment = hourlyworkingPayment;
	}

	public int getExtraHourlyWorkingPament() {
		return extraHourlyWorkingPament;
	}

	public void setExtraHourlyWorkingPament(int extraHourlyWorkingPament) {
		this.extraHourlyWorkingPament = extraHourlyWorkingPament;
	}

	 
		
 
 
 
 
 
 

}
