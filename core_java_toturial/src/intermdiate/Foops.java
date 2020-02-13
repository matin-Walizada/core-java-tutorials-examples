package intermdiate;

public class Foops {

	public static void main(String[] args) {
		int[]  MyArray = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i< MyArray.length; i++ ) {
			
			System.out.println((i) + " = " + MyArray[i]);
		}
		
		
		System.out.println("==========================\n");
		
		
		 for(int A : MyArray) {
			 System.out.println(A);
		 }
		
		 
			System.out.println("==========================\n");
		 
	 
			
			 int i =10;
			  
	         while(i>1){
	        	 
	              System.out.println(i);
	              
	              i--;
	         }

	         int arr[]={10,11,12,13,15,16};
	         
	         //i starts with 0 as array index starts with 0 too
	         int a=0;
	         while(a<6){
	              System.out.println((a)+ " = " + arr[a]);
	              a++;
	         }

		 
   }

	
	

	}


