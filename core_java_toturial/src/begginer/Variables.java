package begginer;

public class Variables {
	
	int a =22;
	
	
	public int method1() {
		int num = 10;
		int number = 20;
		return num + number;
	}
	
	public static void main(String[] args) {
		Variables object = new Variables();
		
		System.out.println(object.method1());
		
		
	}
	
}
