 import javax.swing.JOptionPane;
public class MathQuiz {
    public static void main(String[] args) {
       String input =JOptionPane.showInputDialog(null,
               "How many equestions would you like to solve?");
       int equestions =Integer.parseInt(input);
       for (int i=0; i< equestions; i++) {
            int x = (int)(Math.random() * 10 +1);
            int y = (int)(Math.random() * 10 +1);
           input= JOptionPane.showInputDialog(null, x + "+" + y + "=");
            
            int answer =Integer.parseInt(input);
            int computerAnswer =  x + y;
            
            String result = null;
            if(computerAnswer ==answer  ){ 
                result ="Correct";
            }else  {
                result ="Incorrect";
            }
            JOptionPane.showMessageDialog(null,result);
            int correctAnswers=0;
            int count=0;
            int computerAnswer1=0;
            while (computerAnswer1 != correctAnswers){
                count++;
                 JOptionPane.showMessageDialog(null, count + 
                         correctAnswers
                      +"\nYou got correct out of "+ computerAnswer1); 
                
                
            }
       
         
       }
      
       
       
       
    double percent= equestions/equestions;
        String message = null;
        if (percent < 100 || percent > 90){
            message = " good job";
        } else if (percent >=80 && percent <=90){
            message = "very good";
        } else if (percent >70 && percent < 80){
            message = "amazing";
        }else if (percent >60 && percent < 70){
            message = " good";
        } else if (percent >50 && percent < 60){
            message = "not bad";
        } else if (percent > 50){
            message ="you need more practice";
        }
        Object result;
      
        JOptionPane.showMessageDialog(null, 
                "Tip percentage: " + (percent*100) + "%\n" + message);

       }
    }