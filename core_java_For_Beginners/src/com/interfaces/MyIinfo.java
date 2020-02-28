package com.interfaces;

public class MyIinfo implements Infor2{
	 
	@Override
	public void disply() {
		
		System.out.println("my name is displying in my id");
	
	}
	
	 

	@Override
	public void show() {
		
		
		System.out.println("this is my id");

	}


	
	public static void main(String[] args) {
	 Infor2 object = new MyIinfo();
	 
	 object.disply();
	 object.show();
	 

	}

}
