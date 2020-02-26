import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

 
	public class Book {
	    public static void main(String[] args) {
	    	
//	    	DEFAULT_OPTION
//	    	YES_NO_OPTION
//	    	YES_NO_CANCEL_OPTION
//	    	OK_CANCEL_OPTION
//	    	int – The next int is the MessageType. The different MessageTypes for JOptionPane, are:
//	    	ERROR_MESSAGE
//	    	INFORMATION_MESSAGE
//	    	WARNING_MESSAGE
//	    	QUESTION_MESSAGE
//	    	PLAIN_MESSAGE
	        
		/*
		 * int YES_NO_Cancel = JOptionPane.showConfirmDialog(null,
		 * "Do you like Icream?"); // 0=yes, 1=no, 2=cancel
		 * System.out.println(YES_NO_Cancel);
		 * 
		 * 
		 * int ok = JOptionPane.showConfirmDialog(null, "Click ok if you are ok",
		 * "Be ok!", JOptionPane.DEFAULT_OPTION); // 0=ok System.out.println(ok);
		 * 
		 * 
		 * int warning = JOptionPane.showConfirmDialog(null, "Do you want to proceed?",
		 * "Select an Option...", JOptionPane.YES_NO_CANCEL_OPTION,
		 * JOptionPane.ERROR_MESSAGE);
		 * 
		 * // 0=yes, 1=no, 2=cancel System.out.println(warning);
		 */
	      
	  	
		
		  ImageIcon icon = new ImageIcon("images/afghanistan-flag-circle.png"); int
		  imageicon = JOptionPane.showConfirmDialog(null, "آDO YOU LOVE Afghanistan", "Be honest...",
		  JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
		  
		  // 0=yes, 1=no, 2=cancel
		  System.out.println("prove it!!!" + imageicon);
	    }}
		 
		
	    	 

	   
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
			 
			 
			 
			 
			 
			 
			 
			 
			 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	