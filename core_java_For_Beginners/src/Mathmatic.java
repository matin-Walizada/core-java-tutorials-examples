import javax.swing.JOptionPane;

public class Mathmatic {
	public static void main(String[] args) {

		// input box
		String input1 = JOptionPane.showInputDialog(null, "How many question would you like to answer? ");

		// user chosed qustions to answer
		int userchoosedquestions = Integer.parseInt(input1);

		for (int j = 0; j < userchoosedquestions; j++) {

			int a = (int) (Math.random() * 10 + 1);
			int b = (int) (Math.random() * 10 + 1);

			input1 = JOptionPane.showInputDialog(null, a + " + " + b + " = ");

			int userAnswers = Integer.parseInt(input1);
			int getTheAnswer = a + b;
			String result = null;
			if (getTheAnswer == userAnswers) {

				result = "Correct";
			} else {
				result = "Incorect";
			}

			JOptionPane.showMessageDialog(null, result);

			 int correctAnswers=0;
		       int count=0;
		       int computerAnswer=0;
		       
		       while (computerAnswer == correctAnswers && computerAnswer != correctAnswers){
		           count++;
		            JOptionPane.showMessageDialog(null, count + 
		                    correctAnswers
		                 +"\nYou got correct out of "+ computerAnswer); 
		           
		            JOptionPane.showMessageDialog(null, count + 
		                    correctAnswers
		                 +"\nYou got correct out of "+ computerAnswer); 
		           
		       }

		}

		double percent = userchoosedquestions / userchoosedquestions;
		String message = null;
		if (percent < 100 || percent > 90) {
			message = " good job";
		} else if (percent >= 80 && percent <= 90) {
			message = "very good";
		} else if (percent > 70 && percent < 80) {
			message = "amazing";
		} else if (percent > 60 && percent < 70) {
			message = " good";
		} else if (percent > 50 && percent < 60) {
			message = "not bad";
		} else if (percent > 50) {
			message = "you need more practice";
		}
		Object result;

		JOptionPane.showMessageDialog(null, "Tip percentage: " + (percent * 100) + "%\n" + message);

	}
}