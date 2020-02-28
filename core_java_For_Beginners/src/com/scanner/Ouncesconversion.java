package com.scanner;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ouncesconversion {
    public static void main(String[] args) {
    	
    	
    	
        String input= JOptionPane.showInputDialog(null,"Enter the total number of ounces");
        
        
       double ounces= Double.parseDouble(input);
       
       double cup = ounces/ 8;
      
       DecimalFormat object1 = new DecimalFormat("#.00");
       
       String cup2Deci = object1.format(cup);
       
       double pint = ounces/16;
       DecimalFormat object2 = new DecimalFormat("#.00");
       String pint2Dec = object1.format(pint);
       
       double quart = ounces/32;
       DecimalFormat object3 = new DecimalFormat("#.00");
       String quart2Dec = object1.format(quart);
       
       
       double gallon = ounces/128;
       DecimalFormat object4 = new DecimalFormat("#.00");
       String gallon2Deci = object1.format(gallon);
       
       
       
       
       JOptionPane.showMessageDialog(null, "ounces: " +ounces
               +"\nCups: "+ cup2Deci +"\nPints: "+ pint2Dec +"\nQuarts: "+ quart2Dec
               +"\nGallons: "+ gallon2Deci );
 
       	 
      
    }}