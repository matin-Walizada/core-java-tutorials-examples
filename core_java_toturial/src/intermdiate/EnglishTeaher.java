package intermdiate;

public class EnglishTeaher extends Teachers {
	
	String MainSubject = "English";
	
	
	
	public static void main(String[] args) {
		 
		EnglishTeaher EnglishTeacher = new EnglishTeaher();
		
		System.out.println(EnglishTeacher);
		System.out.println(EnglishTeacher.MainSubject);
		EnglishTeacher.work();
		
		

	}

}
