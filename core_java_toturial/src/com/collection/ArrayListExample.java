package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		 // Creating an empty array list 
        ArrayList<String> bags = new ArrayList<String>(); 
  
        // Add values in the bags list. 
        bags.add("pen"); 
        bags.add("pencil"); 
        bags.add("paper"); 
  
        // Creating another array list 
        ArrayList<String> boxes = new ArrayList<String>(); 
  
        // Add values in the boxes list. 
        boxes.add("pen"); 
        boxes.add("paper"); 
        boxes.add("books"); 
        boxes.add("rubber"); 
        boxes.add("janan"); 
  
        // Before Applying method print both lists 
        System.out.println("Bags Contains :" + bags); 
        System.out.println("Boxes Contains :" + boxes); 
  
        // Apply retainAll() method to boxes passing bags as parameter 
        bags.retainAll(boxes); 
  
        // Displaying both the lists after operation 
        System.out.println("\nAfter Applying retainAll()"+ 
        " method to Boxes\n"); 
        System.out.println("Bags Contains :" + bags); 
        System.out.println("Boxes Contains :" + boxes); 
        
        
        ArrayList<String> employees= new ArrayList<String>();//Creating arraylist  
        employees.add("khan");//Adding object in arraylist  
        employees.add("sara");  
        employees.add("nabi");  
        employees.add("karim"); 
        System.out.println("==========================\n");
        Iterator<String> empName= employees.iterator();  
        while(empName .hasNext()){  
         System.out.println(empName .next());  
        }  

        System.out.println("==========================\n");
        
        for(String empName1:employees  )  
            System.out.println(empName1); 
        System.out.println("==========================\n");
        
        System.out.println("Traversing list through List Iterator:");  
        //Here, element iterates in reverse order 
ListIterator<String> empName2=employees .listIterator(employees.size());  
           while(empName2.hasPrevious())  {  
               String name =empName2.previous();  
               System.out.println(name);  
           }  
System.out.println("==========================\n");
        
           System.out.println("Traversing list through for loop:");  
           for(int i=0;i<employees.size();i++){  
            System.out.println(employees.get(i));     
            } 

           System.out.println("==========================\n");
           
           System.out.println("Traversing list through forEach() method:");           //The forEach() method is a new feature, introduced in Java 8.  
           employees.forEach(empName4->{ //Here, we are using lambda expression  
                          System.out.println(empName4);  
                        });  
           
         
           System.out.println("Traversing list through forEachRemaining() method:");  
           Iterator<String> empName5=employees.iterator();  
           empName5.forEachRemaining(name-> //Here, we are using lambda expression  
           {  
         System.out.println(name);  
           });  

        
        
        
        
        
        
        
        
        
        
        



		
		
		
		

	}

}
