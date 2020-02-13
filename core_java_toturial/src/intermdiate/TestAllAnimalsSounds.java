package intermdiate;

public class TestAllAnimalsSounds {

	public static void main(String[] args) {
		Animals horse = new Horse();
		horse.sound();
		
		System.out.println("========================\n");
		
		Animals cat = new Cat();
		cat.sound();

	}

}
