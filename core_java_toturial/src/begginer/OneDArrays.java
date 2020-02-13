package begginer;

public class OneDArrays {

	public static void main(String[] args) {
		
		
  String[] Students = {"kAMAL", "JAVID", "TMAIM"};
		
		for(String stu : Students ) {
			
			System.out.println(stu);
		}
		
		System.out.println(Students.length);
		
		System.out.println("==================\n");
		for(int i = 0; i <Students.length; i++ ) {
			System.out.println(Students[i]);
		}
		
		// for
		// for each
		// while
		// do while
		System.out.println("==================\n");
		int [] aptNumber = new int[3];
		
		aptNumber[0] = 70;
		aptNumber[1] = 45;
		aptNumber[2] = 60;
		// for each loop
		for(int apt : aptNumber) {
			System.out.println(apt);
		}
		
		System.out.println("================== for looop\n");
		
		// for loop
		for(int i = 0; i <aptNumber.length; i++ ) {
			
			System.out.println(aptNumber[i]);
		}
		
		
		
		
		
		
	
		}
		
		 
		 
		
		

	 

}
