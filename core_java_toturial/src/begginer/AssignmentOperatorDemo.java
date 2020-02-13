package begginer;

public class AssignmentOperatorDemo {
	
	
	
	
	
	
	
	///////=========================================

	int id;
	String name;
	
	//constructor is created from name of the class
	
	
	AssignmentOperatorDemo(int studentId, String studentName){
		
		this.id = studentId;
		this.name = studentName;	
		
	}
		

		
		public static void main(String[] args) {
			
			
			AssignmentOperatorDemo studentInfo = new AssignmentOperatorDemo(10, "Fahim");
			
			System.out.println(studentInfo.id);
			System.out.println(studentInfo.name);
			
			
			AssignmentOperatorDemo obj1 = new AssignmentOperatorDemo(20, "matin");
			
			System.out.println(obj1.id);
			System.out.println(obj1.name);
			
			
			AssignmentOperatorDemo obj2 = new AssignmentOperatorDemo(30, "Zuhoor");
			
			
			System.out.println(obj2.id);
			System.out.println(obj2.name);
			
		///////=========================================
			
			
			
			
			
			
			
			
			
			
		}
	 

	
	
	
	
	
	
	
	
}