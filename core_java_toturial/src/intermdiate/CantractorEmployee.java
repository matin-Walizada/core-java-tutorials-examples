package intermdiate;

public class CantractorEmployee extends MyCompanyEmployee {
	
	public int hourlyWorking;
	public int extraHourlyWorking;
	
	
	
	public CantractorEmployee(String name, int hourlyworkingPayment, int extraHourlyWorkingPament,int hourlyWorking, int extraHourlyWorking ) {
		super(name, hourlyworkingPayment, extraHourlyWorkingPament);
		
		this.hourlyWorking = hourlyWorking;
		this.extraHourlyWorking = extraHourlyWorking;
		
	}

	@Override
	public int caculateSalary() {
		
	if(getExtraHourlyWorkingPament() > 0 && extraHourlyWorking > 0) {
		
	}else {
		return getHourlyworkingPayment() * hourlyWorking;
	}
		
		
		
		return getHourlyworkingPayment() * hourlyWorking + getExtraHourlyWorkingPament() * extraHourlyWorking;
	}

	
	public String toString() {
		
		return "Name: " + getName() + "\nHourly Working "+ hourlyWorking + "\n Hourly working payment " + getHourlyworkingPayment() 
		+ "\nExtra Hourly Working " + extraHourlyWorking + "\nExtra Hourly working Payment" + getExtraHourlyWorkingPament() + "\ntotal payment " + caculateSalary();
	}
	
	
	
	public static void main(String[] args) {
		
CantractorEmployee obj = new CantractorEmployee("Samim", 15, 0, 8, 0);
 
System.out.println(obj);

System.out.println("\n================================================");

CantractorEmployee obj1 = new CantractorEmployee("Hedayatull", 15, 35, 8, 2);

System.out.println(obj1);


	}

}
