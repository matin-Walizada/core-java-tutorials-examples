package intermdiate;

public class MathTeacher extends Teacher {

	String subject = "Matmatic";
	
	public static void main(String[] args) {
		
		
		MathTeacher obj = new MathTeacher();
	
		
		System.out.println(obj.getDesignation());
		System.out.println(obj.getCollegeName());
		System.out.println(obj.subject);
		
		obj.job();
		
		
	}

}
