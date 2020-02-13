package intermdiate;

public class BiologyTeacher extends Teachers {

	
	String MainSubject = "Beiology";
	public static void main(String[] args) {
	
		BiologyTeacher beiologyTeacher =  new BiologyTeacher();
		
		System.out.println(beiologyTeacher.Designation);
		System.out.println(beiologyTeacher.CollageName);
		System.out.println(beiologyTeacher.MainSubject);
		
		beiologyTeacher.work();
	}

}
