package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class BookMain {

	public static void main(String[] args) {

		// Demo 7.18 - Using the compareTo method
		Book book1 = new Book("A Game of Thrones", "George RR Martin", 7.99);
		Book book2 = new Book("A Clash of Kings", "George RR Martin", 8.99);
		Book book3 = new Book("A Storm of Swords", "George RR Martin", 11.99);
		Book book4 = new Book("A Feast for Crows", "George RR Martin", 6.99);
		Book book5 = new Book("A Dance with Dragons", "George RR Martin", 11.99);

		System.out.println(book1.compareTo(book2));
		System.out.println(book3.compareTo(book1));
		System.out.println(book3.compareTo(book5));

		// Demo 7.20 - Using the Comparator Interface
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);

		Collections.sort(bookList, new CompareBooks());

		for(Book book: bookList) {
			System.out.println(book.getTitle() + " : " + book.getPrice());
		}

	}

}
