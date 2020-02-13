package com.OOPs;

 

	class StudentData{
		   private int stuID;
		   private String stuName;
		   private int stuAge;
		   private String school;
		
		
		
		   StudentData(){
		       //no arg constructor
		       stuID = 100;
		       stuName = "New Student";
		       stuAge = 18;}
		   
		   
		   StudentData(int x, String str, int y ){
		       //Parameterized constructor
		       stuID = x;
		       stuName = str;
		       stuAge = y ;
	


		   }
		       
		   StudentData(int x, String str, int y,String school ){
		       //Parameterized constructor
		       stuID = x;
		       stuName = str;
		       stuAge = y ;
			  this.school = school;
			
		   }
		   
		   
		 public static void main(String[] args) {
			 
			 StudentData ob1 = new StudentData();
			 
			 System.out.println(ob1.stuID + " " + ob1.stuName + " " + ob1.stuAge);
			 
			 StudentData ob2 = new StudentData(200, "OLD STUDENT", 20);
			 
			 System.out.println(ob2.stuID + " " + ob2.stuName + " " + ob2.stuAge);
			 
			 StudentData ob3 = new StudentData(300, "ubsent", 2, "Habibya high school");
			 
			 System.out.println(ob3.stuID + " " + ob3.stuName + " " + ob3.stuAge + " " + ob3.school);
		}
}
