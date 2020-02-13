package begginer;

public class OopsObject {
	
	String name;
	int tire;
	String color;
	int year;
	String Model;
	// parametres / argments . prametrized on
	public OopsObject( String name, int tire, String color, int year, String model) {
		// 
		this.name = name;
		this.tire = tire;
		this.color = color;
		this.year = year;
		this.Model = model;
		
	}


	public static void main(String[] args) {
		OopsObject obj = new OopsObject("Rang ROOVER", 52, "Red", 2019, "S");
		
		System.out.println(obj.name + " " + obj.tire + " " + obj.color + " " + obj.year + " " + obj.Model);
		
		OopsObject obj1 = new OopsObject("Farrry", 52, "Black", 2020, "W");
		
		System.out.println(obj1.name + " " + obj1.tire + " " + obj1.color + " " + obj1.year + " " + obj1.Model);
		
		

	}

}
