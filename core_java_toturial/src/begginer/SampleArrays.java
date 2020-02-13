package begginer;

public class SampleArrays {
	

	public static void main(String[] args) {
		// declare, create, instantiates 

		int[] aptNumbers = new int[5];
		
		// add elements into Array
		  
		aptNumbers[0] = 90;
		aptNumbers[1] = 70;
		aptNumbers[2] = 80;
		aptNumbers[3] = 100;
		aptNumbers[4] = 200;
		 
		
	  
		
		
		// printing one element of  Array based on index 

		
		System.out.println(aptNumbers[3]);
	 
		
	   // changing an element of Array
		aptNumbers[3] = 600;
		
		System.out.println(aptNumbers[3]);
		
		System.out.println(aptNumbers.length);
		
		System.out.println("==========================\n");
		
		
		
	  		// printing all elements of an Array using loops- for,while, do while, for eahc loops
		
		for(int i = 0; i < aptNumbers.length; i++ ) {
			
			System.out.println(aptNumbers[i]);
		}
		
		
		System.out.println("==========================\n");
		
		int [] numbers = {20,30,40,60,70,700,900};
		
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);
		
		numbers[4] = 300;
		
		System.out.println(numbers[4]);
		
		//System.out.println(numbers.length);
		
		System.out.println("==========================\n");
		
		for(int num : numbers) {
			System.out.println(num);
		}
	 
		System.out.println("========================== for each loop\n");
		String[] names = {"kamal","jamal","Samim","Hamid","Shabana","Fatana","shabnam" };
		
		System.out.println(names[6]);
		names[2] = "Dawood";
		System.out.println(names[2]);
		
		System.out.println(names.length);
		
		for(String na : names) {
			System.out.println(na);
		}
			
		
		System.out.println("========================== for loop\n");
		for(int n = 0; n < names.length; n++) {
			
			System.out.println((n) + " = " + names[n]);
			 
		}
		
		
		int[][] apartments = new int[3][4];
		// ROW 0
		apartments[0][0] = 10;
		apartments[0][1] = 20;
		apartments[0][2] = 30;
		apartments[0][3] = 40;
		
		// ROW 1
		apartments[1][0] = 50;
		apartments[1][1] = 60;
		apartments[1][2] = 70;
		apartments[1][3] = 80;
		
		//ROW 2 
		
		apartments[2][0] = 90;
		apartments[2][1] = 100;
		apartments[2][2] = 110;
		apartments[2][3] = 120;
		
		
		System.out.println("========================== for loop\n");
		System.out.println(apartments[2][1]);
		
		apartments[2][1] =  1000;
		System.out.println(apartments[2][1]);
		
		System.out.println(apartments.length);
		
		
		
		
		System.out.println("========================== for loop\n");
		for(int i = 0; i < apartments.length; i ++) {
			
			for(int j = 0; j < apartments[i].length; j++)
			
			System.out.println(apartments[i][j]);
		}
			
				
				 
			int[][][] aparts = new int[2][3][4];
		 
		
		
		
		

	}

}
