package com.collection;

import java.util.*;

public class JavaArrayList {

	public static void main(String[] args) {
	
		Student obj1 = new Student(10, "Ahmad", 27);
		Student obj2 = new Student(28, "Tamana", 26);
		Student obj3 = new Student(20, "kamal", 30);
		
		ArrayList<Student> studentsinfo = new ArrayList<Student>();
		
		studentsinfo.add(obj1);
		
		studentsinfo.add(obj2);
		
		studentsinfo.add(obj3);
		
		
		  Iterator itr=studentsinfo.iterator();  
		  
		  
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    
		    System.out.println(st.rollNumber+" "+st.name+" "+st.age);  
		  }
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


