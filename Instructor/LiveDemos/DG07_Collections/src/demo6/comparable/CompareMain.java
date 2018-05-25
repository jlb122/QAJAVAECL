package demo6.comparable;

import demo6.comparable.Book;

public class CompareMain {

	public static void main(String[] args) {
		
		// Demo 7.17 - Use the compareTo method
		Book book1 = new Book("A Game of Thrones", "George RR Martin", 7.99);
		Book book2 = new Book("A Clash of Kings", "George RR Martin", 8.99);
		Book book3 = new Book("A Storm of Swords", "George RR Martin", 11.99);
		Book book4 = new Book("A Feast of Crows", "George RR Martin", 6.99);
		Book book5 = new Book("A Dance with Dragons", "George RR Martin", 11.99);
		
		System.out.println(book1.compareTo(book2)); // -1
		System.out.println(book3.compareTo(book1)); // 1
		System.out.println(book3.compareTo(book5)); // 0

	}

}
