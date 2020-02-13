package intermdiate;

public class EncapsTest1 {

	public static void main(String[] args) {
		// nameof the class + a variable + = + new + constructor of that calss
		EncapsulationDemo1 obj = new  EncapsulationDemo1();
		
		
		
		
		// giving value to variables and printing the value of variables
		
		// we give value to private varibales with it's setter method
		obj.setSsn(34235345);
		obj.setEmpName("Kamal");
		obj.setEmpAge(25);
		
		// we print the value of the variables with getter method of the variable.
		System.out.println("Employee SSN: "+ obj.getSsn());
		System.out.println(" Employee Name: "+ obj.getEmpName());
		System.out.println(" Employee Age: "+obj.getEmpAge());
		
		
	}

}
