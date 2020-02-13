package intermdiate;

public class OverloadingExample2 {

	private int hourLyPay;
	
	public OverloadingExample2() {
		hourLyPay = 100;
		
		
	}
	
	OverloadingExample2(int MyOverTimePay){
		// porpuse of using this() in constructor chaning
		
		
		
		
		hourLyPay = hourLyPay + MyOverTimePay;

		
	}
	
	
	public int getHourLyPay() {
		return hourLyPay;
	}

	public void setHourLyPay(int hourLyPay) {
		this.hourLyPay = hourLyPay;
	}

	public static void main(String[] args) {
		
		
		 OverloadingExample2 obj = new OverloadingExample2(50);
		 System.out.println(obj.getHourLyPay());

	}

}





