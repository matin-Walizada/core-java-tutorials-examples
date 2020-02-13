package com.Arrays;
import java.util.*;




public class BookStore {

	public static void main(String[] args) {

		
		
		ArrayList<Book> BookName = new ArrayList<Book>();
		
		Book obj1 = new Book(1, "Quraan Mubarak", "Allah", "Mohammad pubh");
		
		Book obj2 = new Book(2, "Bokhari", "Emam Bukhari", "Bukhara");
		
		Book  obj3 = new Book(3, "Masnawi", "Mowlavi", "Balkh");
		
		
		
		BookName.add(obj1);
		BookName.add(obj2);
		BookName.add(obj3);
		
		for(Book name : BookName) {
			System.out.println(name.id + " " + name.name + " " + name.author + " " + name.publisher);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
