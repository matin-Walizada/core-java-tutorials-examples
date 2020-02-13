package intermdiate;

public class WebSit {
	
	String sitName;
	int sitAge;
	
	WebSit(String name, int age){
		
		this.sitName = name;
		this.sitAge = age;
		
		
	}
	
	

	public static void main(String[] args) {
		
		WebSit obj1 = new WebSit("GOOGLE", 20);
		
		WebSit obj2 = new WebSit("facebook", 9);
		
		System.out.println("Sit NAME " + obj1.sitName + " " + "Sit YEAR "+  obj1.sitAge);
		
		System.out.println(obj2.sitName + " " + obj2.sitAge);

	}

}
