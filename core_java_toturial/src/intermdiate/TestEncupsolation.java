package intermdiate;

public class TestEncupsolation {

		
	public String position;
	
	public String showPosition(String position) {
		return position;
	}
	
	public static void main(String[] args) {
		 TestEncupsolation test = new TestEncupsolation();
		Encapsulation encup = new Encapsulation();
		
		encup.setEmpName("Ahmad");
		encup.setAge(25);
		encup.setAddress("Albny new york");
		encup.setCellPhone(123);
		
		
		System.out.println(encup);
		System.out.println(test.showPosition("DEVELOPER"));
		Encapsulation obj1 = new Encapsulation();
		
		System.out.println("\n=====================");
		
		
		
		obj1.setEmpName("Kamal");
		obj1.setAge(27);
		obj1.setAddress("Virginia");
		obj1.setCellPhone(323);
		 System.out.println(obj1);
		 System.out.println(test.showPosition("Tester"));
		
	}

}
