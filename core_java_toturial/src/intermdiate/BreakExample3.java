package intermdiate;

public class BreakExample3 {

	public static void main(String[] args) {

		int Ahmad = 25000;
		
		switch (Ahmad) {
		case 20000:
			System.out.println("Ahmad can buy this car");
			break;
			
		case 30000:
			System.out.println("Ahmad can buy this higlander 2018 car");
			break;
			
		case 40000:
			System.out.println("Ahmad can buy this car");
			break;

		default:
			System.out.println("Ahmad can not buy those cars becuse the price is obove ahmads baget");
			break;
		}
		
		
	}

}
