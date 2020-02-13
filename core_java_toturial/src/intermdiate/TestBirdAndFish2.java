package intermdiate;

public class TestBirdAndFish2 extends Eagle {

	public static void main(String[] args) {
		
		// bird class object
		Animal2 obj = new Bird2();
		
		obj.move();
		obj.eat();
		obj.label();
		
		
		// fish class object
		System.out.println("==================\n");
		Animal2 obj1 = new Fish2();
		
		obj1.move();
		obj1.eat();
		obj1.label();
		
		
		System.out.println("==================\n");
		
		Bird2 obj3 = new Eagle();
		
		obj3.move();
		obj3.eat();
		obj3.label();

	}
	
	
	


	
	
	
 
	

}
