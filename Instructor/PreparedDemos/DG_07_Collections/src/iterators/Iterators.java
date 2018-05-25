package iterators;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import lists.Book;


public class Iterators {

	public static void main(String[] args) {
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("A Game of Thrones", "George RR Martin", 7.99));
		bookList.add(new Book("A Clash of Kings", "George RR Martin", 8.99));
		bookList.add(new Book("A Storm of Swords", "George RR Martin", 8.99));
		bookList.add(new Book("A Feast for Crows", "George RR Martin", 8.99));
		
		// Demo 7.14 - Iterators on ArrayLists
		// Have 3 methods: hasNext(), next() and remove()
		
		Iterator<Book> iter = bookList.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Demo 7.15 - Iterators on Maps
		Map<String, Book> bookMap = new HashMap<String, Book>();
		bookMap.put("Book 1", new Book("A Game of Thrones", "George RR Martin", 7.99));
		bookMap.put("Book 2", new Book("A Clash of Kings", "George RR Martin", 8.99));
		bookMap.put("Book 3", new Book("A Storm of Swords", "George RR Martin", 8.99));
		bookMap.put("Book 4", new Book("A Feast for Crows", "George RR Martin", 8.99));
		
		Iterator<Book> iter2 = bookMap.values().iterator();
		
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}

	}

}
