package begginer;

public class JavaArrays {

	public static void main(String[] args) {
		
		int [] Mynum = new int [4];
		// initialization
		Mynum[0] = 10;
		Mynum[1] = 20;
		Mynum[2] = 30;
		Mynum[3] = 40;
		 
		System.out.println(Mynum[3]);
		// printing for each loop
		for(int N : Mynum) {
			System.out.println(N);
		}

		
		String teachers[] = new String[5];
		teachers[0] = "kamal";
		teachers[1] = "zalim";
		teachers[2] = "hamidi";
		teachers[3] = "haris";
		// printing for each loop
		for(String  Tname : teachers ) {
			System.out.println(Tname);
		}
		
		
		String[] Employees = {"Samd", "Ahmad", "Dawood", "sabir", "Zahair"};
		System.out.println(Employees[2]);
		
		for(String emp : Employees) {
			System.out.println(emp);
		}
		
		
		
		
		// Create and instantiate 
		//Syntax 1
		String[] students = new String[4];
		// initialize
		students[0] = "Hasib";
		students[1] = "Hedayet";
		students[2] = "Hamid";
		students[3] = "Neda";
		
		System.out.println(students[1]);
	
	
		
		//Syntax 3
	
		int[] numbers11 = {10,20,30,40,50,};
		
		String names[] = { "kambiz", "salim", "parwiz", "kobandi", "Hasan"};
		
		
		
 		
		System.out.println(names[3]);
		
		System.out.println(names.length);
		
		
		// change the element of an array
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	
		cars[0] = "Camry";
		cars[1] = "GMV";
		cars[2] = "chove";
		cars[3] = "jeep";
		
		System.out.println(cars[3]);
		System.out.println(cars.length);
		
		
		
		String [] vichels = {"mazda", "toyota", "bmw", "GMV", "MERCIDIZE"};
		//for loop syntax
		for(int i = 0; i < vichels.length; i++ ) {
			
			System.out.println(vichels[i]);
			
		}
		
	
		int[] aptNumber = {1,2,3,4,5,6,7,8,9};
		aptNumber[4] = 30;
		// forEach syntax
		
		for(int num: aptNumber ) {
			System.out.print(num);
		}
		
		
		
		
		
		
		
		
		
		//tonigh sessions =====================================================================================================================================================================
		
		// tow dimentional array with 3 rows and four columns
		int[][] numbers = new int[3][4];
		
		numbers[0][0] = 10; numbers[0][1] = 20;  numbers[0][2] = 30;    numbers[0][3] = 40;
		numbers[1][0] = 50; numbers[1][1] =  60; numbers[1][2] = 70;    numbers[1][3] = 80;
		numbers[2][0] = 90; numbers[2][1] = 100; numbers[2][2] = 110;   numbers[2][3] = 120;
		
		System.out.println(numbers[2][1]);
		
		// tow dimensional array with 3 rows and four columns
		int [][] Nab = { 			
							      	{10,20,30,40 },
							      	{50,60,70,80 }, 
								  	{90,95,77,99 }          
				
		};
		
		System.out.println(Nab[2][3]);
		
		// tow dimentional array with two rows and four columns
		int[][] BuldingNumbers = new int[2][4];
		//array 1  index 0
		BuldingNumbers[0][0] = 10;  BuldingNumbers[0][1] = 20;  BuldingNumbers[0][2] = 30;  BuldingNumbers[0][3] = 40;
		BuldingNumbers[1][0] = 90;  BuldingNumbers[1][1] = 80;  BuldingNumbers[1][2] = 70;  BuldingNumbers[1][3] = 60;
		// looping through through elements of array with for loops
			for(int i = 0; i < BuldingNumbers.length; i++) 
			
			for(int j = 0; j < BuldingNumbers[i].length; j++) {
			
			System.out.println(" bulding  number" + BuldingNumbers[i][j]);
				
		
	
			}
	System.out.println("\n");
		
			int Student[][][] = new int[3][2][4];
 			//student one first exame's points
			Student[0][0][0] = 100;  Student[0][0][1] = 99;  Student[0][0][2] = 95;   Student[0][0][3] = 99;
			//student one second exame's points
			Student[0][1][0] = 90;   Student[0][1][1] = 99;  Student[0][1][2] = 100;  Student[0][1][3] = 95;
			
			Student[1][0][0] = 100;  Student[1][0][1] = 99;  Student[1][0][2] = 95;   Student[1][0][3] = 99;
			//student one second exame's points
			Student[1][1][0] = 90;  Student[1][1][1] = 99;   Student[1][1][2] = 100;  Student[1][1][3] = 95;
			
			Student[2][0][0] = 100;  Student[2][0][1] = 99;  Student[2][0][2] = 95;   Student[2][0][3] = 99;
			//student one second exame's points
			Student[2][1][0] = 90;   Student[2][1][1] = 99;  Student[2][1][2] = 100;  Student[2][1][3] = 95;
			
			for(int[][] S1: Student) {
				for(int[] S2: S1) {
					for(int S3: S2) {
						System.out.print(S3+" \t");
					}
					System.out.println("\n");
				}
			}
			
		for(int stu = 0;  stu< Student.length; stu++) {
			System.out.println("student Number " + (stu+1));
			
			for(int exam = 0; exam < Student[stu].length; exam++ ) {
				
				System.out.println("Exam Number " + (exam+1));
				 

				System.out.println(" subjects pont ");
				

				for(int point = 0; point < Student[stu][exam].length; point++)
				System.out.print( (point)+ " => " + Student[stu][exam] [point] + " \t\n"  );;
				 

			}
			
			System.out.println();
			
			
		}
		System.out.println();
		
		
		
		
		
		
		
	}

}
