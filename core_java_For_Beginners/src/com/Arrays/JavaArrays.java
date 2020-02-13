package com.Arrays;

public class JavaArrays {

	public static void main(String[] args) {
		// data type [] arrayname = new data type [number of arrays elements];
		// data type [] namearray = {elements of array};
		
		
		// delare and instantiat
		int []myNumber = new int[3];
		
		// initialize
		myNumber[0] = 10;
		myNumber[1] = 20;
		myNumber[2] = 40;
		
		System.out.println(myNumber[2]);
		
		
		
		System.out.println(myNumber[1]);
		myNumber[1] = 100;
		System.out.println(myNumber[1]);
		
		System.out.println(myNumber.length);
		
		// loop through elements of array
		
		for(int i = 0; i < myNumber.length; i++ ) {
			
			System.out.println(myNumber[i]);
			
		}
		
		System.out.println("=========================================\n");
		
		int aptNumber[] = {10,30,40,50,60};
		
		System.out.println(aptNumber[0]);
		
		aptNumber[2] = 90;
		System.out.println(aptNumber[2]);
		
		System.out.println(aptNumber.length);
		
		System.out.println("=========================================\n");
		
		for(int apt : aptNumber) {
			System.out.println(apt);
		}
		
		System.out.println("=========================================\n");
		
		String names[] = {"Ahmad", "Samim", "javid", "Qadir", "Shabana", "Zuhal"};
		
		System.out.println(names[0]);
		names[2] = "Fazana";
		System.out.println(names[2]);
		System.out.println(names.length);
		
		
		System.out.println("=========================================\n");
		
		for(String name: names) {
			System.out.println(name);
		}
		
		// two dimentional arrays
		
		int myAptNums[][] = new int[2][3];
		
		myAptNums[0][0] = 10;  myAptNums[0][1] = 20;  myAptNums[0][2] = 30;
		
		myAptNums[1][0] = 90;  myAptNums[1][1] = 25;  myAptNums[1][2] = 40;
		
		System.out.println("=========================================\n");
		
		System.out.println(myAptNums[1][2]);
		System.out.println(myAptNums[1][0]);
		
		myAptNums[0][0] = 80;
		
		System.out.println(myAptNums[0][0]);
		
		// loops through elements of array. printting all elements of array
		
		// for loop
		
		System.out.println("==============for loop===========================\n");
		for(int i = 0; i < myAptNums.length; i++ ) 
			for(int x = 0; x < myAptNums[i].length; x++) {
				System.out.println((i)+(x) + " " + myAptNums[i][x]);
			}
			
			
		// for each loop 
		System.out.println("==============for each loop===========================\n");
		for(int[] apt: myAptNums) {
			for(int ap: apt) {
				
				System.out.println(ap);
				
			}
		}
		
		
		
		String employeeNames[][] = {
									{"A", "B", "C", "D"},
									{"E", "F", "G", "H"},
									{"I", "K", "L", "M"} 
							
		};
		
		System.out.println("=========================================\n");
		
		System.out.println(employeeNames[1][3]);
		
		// Multi Dimentional array
		
		int empId[][][] = new int[3][2][4];
		
		
		// 0 TABLE
		empId[0][0][0] = 10;   empId[0][0][1] = 20;  empId[0][0][2] = 30;  empId[0][0][3] = 40;
		
		empId[0][1][0] = 50;   empId[0][1][1] = 60;  empId[0][1][2] = 70;  empId[0][1][3] = 90;
		
		// 1 TABLE
		
		empId[1][0][0] = 91;  empId[1][0][1] = 92;  empId[1][0][2] = 93;  empId[1][0][3] = 94;
		
		empId[1][1][0] = 95;  empId[1][1][1] = 96;  empId[1][1][2] = 97; empId[1][1][3] = 98;
		
		//2 TABEL
		
		empId[2][0][0] = 100;  empId[2][0][1] = 101;  empId[2][0][2] = 102;  empId[2][0][3] = 103;
		
		empId[2][1][0] = 104;  empId[2][1][1] = 105; empId[2][1][2] = 106; empId[2][1][3] = 107;
		
		
		
		System.out.println("=========================================\n");
		System.out.println(empId[2][0][0]);
		
		empId[2][0][0] = 200;
		
		System.out.println(empId[2][0][0]);
		
		
		System.out.println("====================for loop=====================\n");
		for(int a = 0; a < empId.length; a++) {
			
			for(int b = 0; b < empId[a].length; b++ ) {
				
				for(int c = 0; c <empId[a][b].length; c++)
					
					System.out.println(empId[a][b][c]);
					
			}
			
			
			
			
			
			
		}
		
		
		
		
		for(int[][] emp: empId ) {
			for(int[] em: emp ) {
				for(int e: em) {
					System.out.println(e);
				}
				
			}
		}
		
		
		
		
		
		
		
		
	

	}

}
