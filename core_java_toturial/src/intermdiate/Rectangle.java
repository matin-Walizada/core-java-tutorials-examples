package intermdiate;

public class Rectangle extends Shap {
	
	double lenght;
	double width;
	
	
	public Rectangle(String color, double lenght, double width) {
		super(color);
		this.lenght = lenght;
		this.width = width;
	}
	
	
	@Override
	double area() {
	 
		return lenght * width;
	}
	
	@Override
	public String toString() {
	 
		return "Rectongle color is  " + super.color + " and rectongle area is" + area();
	}
	
	
	
	
	

}
