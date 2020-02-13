package intermdiate;

public class Generic {
	
	public static <E> void printGenericArray(E[] inputArray) {
		for(E GenericArr: inputArray) {
			System.out.println(GenericArr);
		}
	}

	public static void main(String[] args) {
		
		
		
		String[] StringArray = {"Ahmad","Kamal", "Jamal","Samim"};
		
		Integer[] StringArr = {2,4,5,6,7,4,5,6,7};
		printGenericArray(StringArray);
		printGenericArray(StringArr);
 
	}

}
