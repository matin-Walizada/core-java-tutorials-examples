package begginer;

public class Vihichle {
	String name = "jeep";
	String tire = "vic 54";
	String light = "shekari";
	String color = "black";
	int door = 4;
	String extraTire = " has extra tire";
	static String stringWhile = " meduim size";
	static String company = " jeep";
	
	int speed(int mile ) {
		return mile;
	}
	
	public static void main(String[] args) {
		
		Vihichle jeep = new Vihichle();
		// 2010
		System.out.println("Name " + jeep.name);
		System.out.println("TIRE " + jeep.tire);
		System.out.println("light " + jeep.light);
		System.out.println("COLOR " + jeep.color);
		System.out.println("EXTRA tire  " + jeep.extraTire);
		System.out.println("DOOR " + jeep.door);
		System.out.println("string while " + stringWhile);
		System.out.println(" mile " + jeep.speed(160));
		
		//2011
		
		System.out.println("Name " + jeep.name);
		System.out.println("TIRE " + jeep.tire);
		System.out.println("light " + jeep.light);
		System.out.println("COLOR " + jeep.color);
		System.out.println("EXTRA tire  " + jeep.extraTire);
		System.out.println("DOOR " + jeep.door);
		System.out.println("string while " + stringWhile);
		System.out.println(" mile " + jeep.speed(160));
		
		
	}
		
	
	
		
	



}
