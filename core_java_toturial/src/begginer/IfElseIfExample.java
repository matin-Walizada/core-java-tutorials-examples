package begginer;

public class IfElseIfExample {

	public static void main(String[] args) {

		int number = 0;
		
		if(number < 100 && number>=10) {
			System.out.println("it is a 2 digit number");
			
			
		} else if(number < 1000 && number >= 100) { 
			System.out.println("it is a 3 digit number");
			
		} else if(number < 10000 && number>= 1000) {
			System.out.println("it is a 4 digit number");
			
		}else {
			System.out.println("the number is not between the 1 and 9999");
		}
		
		
		
	}

}
