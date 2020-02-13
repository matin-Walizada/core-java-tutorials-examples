package begginer;

public class MyCat {
	
	String color;
	String eye;
 
	
	public MyCat(String catColor, String catEye ) {
		 this.color = catColor;
		 this.eye = catEye;
	}
	 
	public void hunt() {
		System.out.println("every cat hunts mouses");
	} 
	
	

	public static void main(String[] args) {
		
		MyCat cat = new MyCat("white", "blue");
		
		System.out.println("My CAT COLOR IS " + cat.color);
		System.out.println("My CAT EYES ARE " + cat.eye);
		cat.hunt();
		
		System.out.println("===============");
		
		MyCat cat2 = new MyCat("Black", "dark BLUE");
		
		System.out.println("My CAT COLOR IS " + cat2.color);
		System.out.println("My CAT EYES ARE " + cat2.eye);
		cat2.hunt();

	}

}
