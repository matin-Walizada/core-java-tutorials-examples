package begginer;

public class ThreeDimArray {

	public static void main(String[] args) {

		int [][][] apartmentsNumbers = new int[2][3][4];
		// table 0 
		apartmentsNumbers[0][0][0] = 10;
		apartmentsNumbers[0][0][1] = 20;
		apartmentsNumbers[0][0][2] = 30;
		apartmentsNumbers[0][0][3] = 40;
	
		apartmentsNumbers[0][1][0] = 50;
		apartmentsNumbers[0][1][1] = 60;
		apartmentsNumbers[0][1][2] = 70;
		apartmentsNumbers[0][1][3] = 80;
		
		apartmentsNumbers[0][2][0] = 90;
		apartmentsNumbers[0][2][1] = 100;
		apartmentsNumbers[0][2][2] = 110;
		apartmentsNumbers[0][2][3] = 120;
		
		
		
		// table 1
		apartmentsNumbers[1][0][0] = 200;
		apartmentsNumbers[1][0][1] = 300;
		apartmentsNumbers[1][0][2] = 400;
		apartmentsNumbers[1][0][3] = 500;
	
		apartmentsNumbers[1][1][0] = 600;
		apartmentsNumbers[1][1][1] = 700;
		apartmentsNumbers[1][1][2] = 800;
		apartmentsNumbers[1][1][3] = 900;
		
		apartmentsNumbers[1][2][0] = 100;
		apartmentsNumbers[1][2][1] = 2000;
		apartmentsNumbers[1][2][2] = 3000;
		apartmentsNumbers[1][2][3] = 4000;
		
		
		
//		for(int i = 0;  i< apartmentsNumbers.length; i++) {
//			System.out.println("student Number " + (i+1));
//			
//			for(int j = 0; j < apartmentsNumbers[i].length; j++ ) {
//				
//				System.out.println("Exam Number " + (j+1));
//				 
//
//				System.out.println(" subjects pont ");
//				
//
//				for(int k = 0; k < apartmentsNumbers[i][j].length; k++)
//				System.out.print( (k)+ " => " + apartmentsNumbers[i][j] [k] + " \t\n"  );;
//				 
//
//			}
//			
//			System.out.println();
//			
//			
//		}
//		System.out.println();
//		
	  
		
 
		for(int[][]apt1: apartmentsNumbers) {
			for(int []apt2: apt1) {
				for(int apt3: apt2) {
					System.out.print(apt3+" \t");
				}
				System.out.println("\n");
			}
		}
	 
		
		 
		 
	}
	
	
	

}
