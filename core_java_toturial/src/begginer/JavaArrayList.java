package begginer;

import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {
 
		
		ArrayList<String> a = new ArrayList();
		
		a.add("Sana");
		a.add("Hasina");
		a.add("matin");
		System.out.println(a);
		System.out.println(a.lastIndexOf(1));
		
		for(String b : a) {
			System.out.println(b);
		}
		
		
		for(int i = 0; i < a.size(); i++) {
			System.out.println((i) + "  " + a.get(i));
		}
		
    	}

}
