package intermdiate;

public class AllTeahers {

	public static void main(String[] args) {
		
	PhysicsTeacher ph = new PhysicsTeacher();
		System.out.println(ph.name);
		System.out.println(ph.designation);
		System.out.println(ph.collegeName);
		ph.job();
		
		
		System.out.println(ph.mainSubject);
		
		System.out.println("==============\n");
		
		
		EnglishTeacher Eng = new EnglishTeacher();
		System.out.println(Eng.name);
		System.out.println(" position " +Eng.designation);
		System.out.println("Collage Name " + Eng.collegeName);
		Eng.job();
		
		System.out.println(" What subject dose she teach " + Eng.mainSubject);
		
		System.out.println("==============\n");
		
		
		Math math = new Math();
		System.out.println(math.name);
		System.out.println(math.designation);
		System.out.println(math.collegeName);
		
		math.job();
		
		System.out.println(math.mainSub);
		
		 

	}

}
