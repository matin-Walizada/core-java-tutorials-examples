package intermdiate;

public class CantractorEmployees extends CompanyEmployee {
	
	public int workingHourPayment;
	public int extraWorkingHourPayment;
	public CantractorEmployees(String name, int workingHours, int extraWorkingHour, int workingHourPayment, int extraWorkingHourPayment) {
		super(name, workingHours, extraWorkingHour);
		
		this.workingHourPayment = workingHourPayment;
		this.extraWorkingHourPayment = extraWorkingHourPayment;
 	}

	@Override
	public int caculateSalary() {
 		
 		if(getExtraWorkingHour() > 0 && extraWorkingHourPayment > 0) {
 			
 		} else {
 			System.out.println("there is not extra working today");
 		}
 		
 		return getWorkingHours() * workingHourPayment + getExtraWorkingHour() * extraWorkingHourPayment;
 		 
	}

	public String toString() {
		return "Name: " + getName() + ".\nWorking Hour " + getWorkingHours() + "\nworking HOURS PAYMENT " + workingHourPayment + ".\nExtra Working Hour " + getExtraWorkingHour()+"\nextara working hour payment " + extraWorkingHourPayment + ".\nTatal payment " + caculateSalary();
	}
	
	
	public static void main(String[] args) {
		
		CantractorEmployees obj = new CantractorEmployees("Matin", 8, 2, 10, 20);
 		System.out.println(obj);
		 
 
		
	}

}
