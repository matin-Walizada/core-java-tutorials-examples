package intermdiate;

public class TestBirdAndFish {

	public static void main(String[] args) {
		 Animal myBird = new Bird();
		 
		 myBird.move();
		 myBird.eat();
		 myBird.label();
		 
		 System.out.println("======================\n");
		 Animal MyFish = new Fish();
		 MyFish.move();
		 MyFish.eat();
		 MyFish.label();
		 
		 
		 

	}

}
