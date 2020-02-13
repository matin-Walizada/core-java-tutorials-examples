package begginer;

public class VariablesScope {

	
	
// global
	
	public int x = 100;
	
	
// class or static

	static int y = 200;
	

	public int sum() {
		// locals are always creats in side method and we cant access from ouside the mothod.
		int a = 10;
		int b = 20;
		
		return a + b;
	}
	public static void main(String[] args) {
		
		// name of class + name object + = + new name of constructor();
		VariablesScope obj = new VariablesScope();
		
		System.out.println(obj.sum());
		System.out.println(obj.x);
		
		System.out.println(y);
		System.out.println(obj.y);
		System.out.println(VariablesScope.y);
		
		int a = 10;
		 int b = 20;
		  
		a = b;
		
		System.out.println(a);
		
		a += b;
		System.out.println(a);
		
		a *= b;
		
		System.out.println(a);
		
		a -= b;
		System.out.println(a);
		
		a /= b;
		System.out.println(a);
		
		a %= b;
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
	}
	
	
	
	

}
