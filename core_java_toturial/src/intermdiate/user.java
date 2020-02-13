package intermdiate;

import java.util.ArrayList;
import java.util.Scanner;

class user{
	
	public static void main(String[] args) {
		String name;
		Scanner in = new Scanner(System.in);
		ArrayList<String> sNames = new ArrayList<>();
		
		sNames.add("Negina,Wassim,Mohamad,Zahra,Kristal,Omar");
		sNames.add("Shahnaaz,Mohamad,Mohmod,ali");
		sNames.add("Behter,Bahara,Zeba");
		sNames.add("Homira,Shabnam");

		sNames.get(1);
	
		// java has many built in classess
		 
		 
		 
		 System.out.println("Do you want to be delated the names from the ArrayList: ");
		 name = in.next();
		 
		if (name.equals("yes")) {
		   System.out.println("enter the location of the name which you want to be delated: ");
		   
		   
		   sNames.add(in.next());
		   
		   String remove = sNames.remove(sNames.indexOf(sNames));
		   
		   System.out.println(sNames.remove(sNames));
		   } else {
			   System.out.println("the name is deleted");
		      
		   }
	}
	
 
}