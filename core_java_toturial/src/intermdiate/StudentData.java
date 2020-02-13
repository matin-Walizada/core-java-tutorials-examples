package intermdiate;

public class StudentData {
	
	// Constructor overloading
	private int id;
	private String name;
	private int age;
	
	
	public StudentData() {
		id = 1;
		name = "Hedayat";
		age = 25;
	}
	
	
	public StudentData(int stId, String stName, int StAge) {
		
		id = stId;
		name = stName;
		age = StAge;
		
		
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {

		StudentData obj1 = new StudentData();
		
		System.out.println(obj1.getId());
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		
		
		StudentData obj2 = new StudentData(2, "Hamid", 24);
		
		System.out.println(obj2.getId());
		System.out.println(obj2.getName());
		System.out.println(obj2.getAge());
		
		
		
		
	}

}
