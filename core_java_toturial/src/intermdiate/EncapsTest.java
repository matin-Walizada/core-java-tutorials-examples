package intermdiate;

public class EncapsTest {

	public static void main(String[] args) {

		EncapsulationDemo obj = new EncapsulationDemo();
		
		obj.setSsn(3434);
		obj.setName("jamail");
		obj.setAge(34);
		
		System.out.println(obj.getSsn());
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}
