package intermdiate;

public class Camry {

	private String CarName;
	String model;
	String color;
	int year;
	String make;
	String gare;
	String interior;
	int milage;
	String doors;
	
	
	
 
	public Camry(String carName, String model, String color, int year, String make, String gare, String interior,
			int milage, String doors) {
		super();
		CarName = carName;
		this.model = model;
		this.color = color;
		this.year = year;
		this.make = make;
		this.gare = gare;
		this.interior = interior;
		this.milage = milage;
		this.doors = doors;
	}

	int speed(int speed) {
		return speed;
	}

	public String getCarName() {
		return CarName;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	public String getMake() {
		return make;
	}

	public String getGare() {
		return gare;
	}

	public String getInterior() {
		return interior;
	}

	public int getMilage() {
		return milage;
	}

	public String getDoors() {
		return doors;
	}
	
	
}
