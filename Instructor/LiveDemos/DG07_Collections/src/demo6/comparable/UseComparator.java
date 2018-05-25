package demo6.comparable;

import java.util.ArrayList;
import java.util.Collections;

import demo1.lists.Book;

public class UseComparator {

	public static void main(String[] args) {
		
		Book book1 = new Book("A Game of Thrones", "George RR Martin", 7.99);
		Book book2 = new Book("A Clash of Kings", "George RR Martin", 8.99);
		Book book3 = new Book("A Storm of Swords", "George RR Martin", 11.99);
		Book book4 = new Book("A Feast of Crows", "George RR Martin", 6.99);
		Book book5 = new Book("A Dance with Dragons", "George RR Martin", 11.99);
		
		ArrayList<Book> booklist = new ArrayList<>();
		booklist.add(book1);
		booklist.add(book2);
		booklist.add(book3);
		booklist.add(book4);
		booklist.add(book5);
		
		Collections.sort(booklist, new CompareBooks());
		
		for(Book bookInBooklist: booklist) {
			System.out.println(bookInBooklist.getTitle() + " : " + bookInBooklist.getPrice());
		}

	}

}
