package begginer;

public class ChainingConstructor {

	int id;
	int age;
	String name;
	
	public ChainingConstructor() {
	 this(1,20, "kamal");
	}
	
	public ChainingConstructor(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	

	public static void main(String[] args) {
		
		ChainingConstructor obj = new ChainingConstructor();
		
		System.out.println(obj.id);
		System.out.println(obj.age);
		System.out.println(obj.name);
	}

}
