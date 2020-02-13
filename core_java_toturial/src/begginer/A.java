package begginer;

public class A {
	
	static boolean a = true;
	static boolean b = true ;
	
	
	static int z = 10;
	static int y = 20;
	
	 
     

	
	
public static void getcondiation() {
	if((a && b ) == true && ( b && a) == true) {
		
		
		System.out.println("that is true");
	} else {
		System.out.println("that is not true");
	}
	
	
}
	
	static void getNum() {
		if (z!=y) {
			System.out.println("that is correct");
		}else {
			System.out.println("that is not correct");
		}
	}

	
//	&& true and true == true;
//	&& true and false == false;
//	&& false and false == false;
//	
//	
//	|| true and true = true;
//	|| true and false = true;
//	|| false and false == false

	public static void main(String[] args) {
getcondiation();

getNum();





int num1, num2;
num1 = 25;
/* num1 is not equal to 10 that's why
* the second value after colon is assigned
* to the variable num2
*/
num2 = (num1 == 10) ? 100: 200;
System.out.println( "num2: "+num2);

/* num1 is equal to 25 that's why
* the first value is assigned
* to the variable num2
*/
num2 = (num1 == 25) ? 100 : 200;
System.out.println( "num2: "+num2);

	}
	
	

}
