package demo4.interators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import demo1.lists.Book;

public class IteratorsMain {

	public static void main(String[] args) {
		
		ArrayList<Book> booklist = new ArrayList<>();
		
		booklist.add(new Book("A Game of Thrones", "George RR Martin", 7.99));
		booklist.add(new Book("A Clash of Kings", "George RR Martin", 8.99));
		booklist.add(new Book("A Storm of Swords", "George RR Martin", 8.99));
		booklist.add(new Book("A Feast of Crows", "George RR Martin", 8.99));
		
		// Demo 7.13 - Iterators on ArrayLists
		// 3 methods available: hasNext(), next() and remove()
		Iterator<Book> iter = booklist.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Demo 7.14 - Iterators on Maps
		Map<String, Book> bookmap = new HashMap<>();
		bookmap.put("Book 1", new Book("A Game of Thrones", "George RR Martin", 7.99));
		bookmap.put("Book 2", new Book("A Clash of Kings", "George RR Martin", 8.99));
		bookmap.put("Book 3", new Book("A Storm of Swords", "George RR Martin", 8.99));
		bookmap.put("Book 4", new Book("A Feast of Crows", "George RR Martin", 8.99));
		
		Iterator<Book> iter2 = bookmap.values().iterator();
		
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
