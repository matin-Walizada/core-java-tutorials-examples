package intermdiate;

public class Rectangel extends Shape{

	double length;
	double width;
	
	public Rectangel(String shapColor, double RecLength, double RecWidth) {
		super(shapColor);
		
		this.length = RecLength;
		this.width = RecWidth;
	}
	
	  
	
	 
	public double area() {
		return length*width;
	}
	
	public String toString() {
		return "Rectangle color is " + super.color + "and Rectangel area is : " + area();
	}
	

	public static void main(String[] args) {
	 
	}

}
