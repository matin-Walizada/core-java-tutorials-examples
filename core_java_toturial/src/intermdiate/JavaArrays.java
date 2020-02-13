package intermdiate;

import java.util.ArrayList;
import java.util.List;

public class JavaArrays {

	public static void main(String[] args) {

		// Arrays
		int[] arrayone = {1,2,3,4,5,6};
		int[] array1 = new int[4];
		
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		
 // printing the an element of array
		System.out.println(array1[2]);
		
		// changing an element of array
		
		array1[3] = 10;
		System.out.println(array1[3]);
		
		
		// finding the length of array
		
		System.out.println(arrayone.length);
		
		System.out.println("=============================\n");
		
		// printing  all arrys elements using for loop
		for(int a = 0; a < array1.length; a++) {
			
			System.out.println((a) + " = " + array1[a]);
		}
		System.out.println("=============================\n");
		
		// printing  all arrys elements using forEach loop
		
		for(int arr : array1) {
			
			System.out.println(arr);
		}
		
		
		//------------------------------------------------------
		
		// 2 dimentional Arrays
		String[][] array2 = {  
				
				
				 {"Kamal", "jamal", "Dawood"},
				 {"Hedayat", "Hasib", "Hamid"}
				 
				 
		};
		
		String[][] Array2 = new String[2][3];
		
		Array2[0][0] = "Kamal";
		Array2[0][1] = "jamal";
		Array2[0][2] = "Dawood";
		
		Array2[1][0] = "Hedayat";
		Array2[1][1] = "Hasib";
		Array2[1][2] = "Hamid";
//		
//		System.out.println(Array2[0][2]);
//		
//		System.out.println(Array2[0][0]);
//		System.out.println(Array2[1][0]);
		
		//Array2[0][2] = "Bashir";
		
		//System.out.println(Array2[0][2]);
		
		//System.out.println(array2.length);
		
		System.out.println("=============================\n");
		
		
		for(int j = 0; j < Array2.length; j++) {
			
			for(int m = 0; m <Array2[j].length; m++) {
				
				System.out.println((j)+(m)+" = " + Array2[j][m]);
				
			
			}
		}
		
		
		System.out.println("=============================\n");
		
		for(String[] A : Array2) {
			
			for(String  B: A) {
				
				
				System.out.println(B);
			}
			
			
		}
		
		
		
		int[][][] threeDiArray = new int[2][3][3];
		
		
		threeDiArray[0][0][0] = 10;
		threeDiArray[0][0][1] = 20;
		threeDiArray[0][0][2] = 30;
		
		threeDiArray[0][1][0] = 40;
		threeDiArray[0][1][1] = 50;
		threeDiArray[0][1][2] = 50;
		
		threeDiArray[0][2][0] = 60;
		threeDiArray[0][2][1] = 70;
		threeDiArray[0][2][2] = 80;
		
		//===================================
		
		
		threeDiArray[1][0][0] = 90;
		threeDiArray[1][0][1] = 100;
		threeDiArray[1][0][2] = 110;
		
		threeDiArray[1][1][0] = 120;
		threeDiArray[1][1][1] = 130;
		threeDiArray[1][1][2] = 140;
		
		threeDiArray[1][2][0] = 150;
		threeDiArray[1][2][1] = 160;
		threeDiArray[1][2][2] = 170;
		
		
		
		System.out.println(threeDiArray[1][2][1]);
		threeDiArray[0][0][0] = 2000;
		System.out.println(threeDiArray[0][0][0]);
		
		System.out.println(threeDiArray[0][0].length);
		
		
		
		System.out.println("============FOREACH LOOP=================\n");
		for(int[][] A1 : threeDiArray) {
			
			for(int[] B1 : A1 ) {
				for(int C1: B1) {
					System.out.println(C1);
				}
			}
			
		}
		
		System.out.println("============FOR LOOP=================\n");
		
		
		
	for(int a1 = 0; a1 <threeDiArray.length; a1++ ) {
		for(int b1 = 0; b1 <threeDiArray[a1].length; b1++ ) {
			for(int c1 = 0; c1 < threeDiArray[a1][b1].length; c1++) {
				System.out.println((a1)+(b1) +(c1) +" = "+ threeDiArray[a1][b1][c1]);
			}
		}
	}
		
		int[][][] threeDiArray1 = {
				
				// first table 
				
				{  
					{01,12,23},
					{01,12,23},
					{01,12,23}   
					
			},
				
				//second table
				{  
						{1,2,3},
						{1,2,3},
						{1,2,3}            },
				
				
				
				
				
				
		};
		
		
		// Array List array creation syntax
		// collection is a data stracture from work of java
		
		
		
// creating an arrayList from another arraylist
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		A.add(20);
		A.add(30);
		A.add(40);
		A.add(50);
		A.add(60);
		A.add(70);

		ArrayList<Integer> B = new ArrayList<Integer>(A);
	
	
		ArrayList<Integer> C =  new ArrayList<Integer>();
	
	C.add(80);
	C.add(90);
	C.add(100);
	
	B.addAll(C);
	
	
	
	
	System.out.println(B);
	
	System.out.println(A);
	
	System.out.println(C);
	 
	
	
		





		
	
		
		 
		
		
		
		
		
		
		

	}

}
