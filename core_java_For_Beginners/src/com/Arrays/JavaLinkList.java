package com.Arrays;


import java.util.*;
public class JavaLinkList {

	public static void main(String[] args) {
	
	
		
		LinkedList<String> Teachers = new LinkedList <String>();
		
		
		
		Teachers.add("Roman");
		Teachers.add("Dawar");
		Teachers.add("Edress");
		
		System.out.println(Teachers);
		
		
		for(String teachersName : Teachers) {
			
			System.out.println(teachersName);
		}
		
		
	System.out.println("======================\n");
		Teachers.add(0, "Parvez");
		
		System.out.println(Teachers.get(0));
		
		
		LinkedList<String> HeadMasters = new LinkedList<String>();
		
		
		HeadMasters.add("Shirzad");
		HeadMasters.add("payam");
		HeadMasters.add("Ashqullah");
		
		
		Teachers.addAll(HeadMasters);
		
		System.out.println(Teachers);
		
		
		Teachers.addFirst("Abdul Faim");
		
		System.out.println(Teachers);
		
		Teachers.removeLast();
		
		System.out.println(Teachers);
		
		Teachers.removeFirst();
		
		System.out.println(Teachers);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
