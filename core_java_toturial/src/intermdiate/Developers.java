package intermdiate;

public class Developers extends Managers {

	String carrier = "Developers";
	String name = "Kamal";
	int age = 20;
	
	
	

	public static void main(String[] args) {
		Developers obj = new Developers();
		
		System.out.println(" Company Name "  + obj.CompanyName);
		System.out.println(" Company address " + obj.AddresS);
		System.out.println(" Carrier " + obj.carrier);
		
		

		obj.job();
		
		
		

	}

}
