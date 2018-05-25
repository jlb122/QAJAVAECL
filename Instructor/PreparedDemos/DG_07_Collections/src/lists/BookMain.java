package lists;

import java.util.ArrayList;

public class BookMain {
	public static void main(String[] args) {
		
		// Demo 7.01 - Create a book and a booklist
		Book b = new Book("A Clash of Kings", "George RR Martin", 8.99);
		
		ArrayList<Book> bookList = new ArrayList<>();
		
		// Demo 7.02 - Add books to the list
		bookList.add(new Book("A Game of Thrones", "George RR Martin", 7.99));
		bookList.add(b);
		
		// Demo 7.03 - Access all items in the ArrayList
		for(Book book : bookList) {
			System.out.println(book);
			System.out.println(book.getTitle());
		}
		
		// Demo 7.04 - Access particular element
		System.out.println(bookList.get(0));
		
		// When you don't know the index...
		for(Book book : bookList) {
			if(book.getTitle().equals("A Clash of Kings")) {
				System.out.println("Index of " + book.getTitle() + ": " + bookList.indexOf(book));
			}
		}
		
		// Demo 7.05 - Remove Elements
		
		bookList.remove(0);
		bookList.remove(b);
		
		System.out.println(bookList);
		
	
	}
}
