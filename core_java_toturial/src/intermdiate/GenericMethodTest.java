package intermdiate;

public class GenericMethodTest {
	
	
 public static <E> void printAllTypesOfArraysElements(E[] inputArray) {
	 
	 for(E arr : inputArray) {
		 System.out.println(arr);
	 }
 }
		
		
		
	 
	 
	public static void main(String[] args) {
		
		String[] StArray = {"kamal", "samaim","dawood","Samim"};
		Integer[] inArr = {1,2,3,4,5,6,7,8};
		Double[] DoubeArray = {34.4, 56.9, 77.80};
		
		
		printAllTypesOfArraysElements(StArray);
		
		printAllTypesOfArraysElements(inArr);
		
		
		printAllTypesOfArraysElements(DoubeArray);
		
		
	
		
	}

}
