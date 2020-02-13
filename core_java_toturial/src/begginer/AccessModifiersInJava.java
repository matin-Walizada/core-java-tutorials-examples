package begginer;

 public class AccessModifiersInJava  {

	
	
	
	// accesss from every where
	public String name;
	
	// just access from inside class
	private String lastName;
	
	// access from inside the class and within the package
	String middlNam = "Ahmad";
	
	//access from inside class within the package outside the package through child class
	protected int age = 25;
	
	
	
	
	public static void main(String[] args) {
		AccessModifiersInJava obj = new AccessModifiersInJava();
		
		System.out.println(" AGE "+ obj.age);

	}
	
	
 

}
