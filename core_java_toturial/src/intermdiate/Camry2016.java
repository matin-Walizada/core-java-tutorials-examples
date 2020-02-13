package intermdiate;

public class Camry2016 extends Camry {
 
	
	
 


	public Camry2016(String carName, String model, String color, int year, String make, String gare, String interior,
			int milage, String doors) {
		super(carName, model, color, year, make, gare, interior, milage, doors);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	@Override
	public String toString() {
		return "Camry2016 [Name=" + getCarName() + ", Model=" + getModel() + ", Color=" + getColor()
				+ ", YEAR=" + getYear() + ", Make=" + getMake() + ", Gare=" + getGare()
				+ ", interior=" + getInterior() + ", Milage=" + getMilage() + ", Doors=" + getDoors()
			+ "Speed " + speed(200) + " MILES "
				+ "]";
	}





	public static void main(String[] args) {
		
	 Camry2016 obj = new Camry2016("Camry", "LE", "BLACK", 2016, "TOYOTA", "AUTOMATIC", "LEATHER", 0, "4 DOORS ");
	 
	 System.out.println(obj);
	}

}
