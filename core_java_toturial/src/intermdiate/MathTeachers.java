package intermdiate;

public class MathTeachers extends Teachers {
	
	String mainSubject = "Mathmatic";
	
	

	public static void main(String[] args) {
		 
		MathTeachers math_Teaher = new MathTeachers();
		
		System.out.println(math_Teaher.Designation);
		System.out.println(math_Teaher.CollageName);
		System.out.println(math_Teaher.mainSubject);
		math_Teaher.work();
		

	}

}
