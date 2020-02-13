package intermdiate;

public abstract class Shape {
	
	String color;
	// method doesn't have body because the implementation of this method is done on other class. we override this method
	abstract double area();
	
	public Shape(String shapColor) {
		this.color = shapColor;
			
	}
	
	public String getColor() {
		return color;
	}

}
