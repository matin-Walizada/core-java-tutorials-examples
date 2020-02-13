package intermdiate;

public abstract class Shap {
	
	String color;
	
		abstract double area();
		
		public abstract String toString();

		
		public Shap(String color) {
		
			this.color = color;
		}
		 
		
		public String getColor() {
			return color;
		}
		
		

}
