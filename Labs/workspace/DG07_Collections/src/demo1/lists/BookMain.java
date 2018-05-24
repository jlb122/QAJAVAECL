package demo1.lists;

import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) {

		//Demo 7.1 - Create a book and a booklist
		Book b = new Book("A Clash of Kings", "George RR Martin", 8.99);
		
		ArrayList<Book> booklist = new ArrayList<>();
		
		// Demo 7.2 - Add books to the booklist
		booklist.add(b);
		booklist.add(new Book("A Game of Thrones", "George RR Martin", 7.99));
		
		// Demo 7.3 - Access all items in booklist individually
		for(Book inThisList : booklist) {
			System.out.println(inThisList);
			System.out.println(inThisList.getTitle());
			System.out.println(inThisList.getAuthor());
		}
		
		System.out.println("\n");
		
		// Demo 7.4 - Access a particular element
		// use the get() method, supplying an index
		System.out.println(booklist.get(0));
		
		// When you don't know the index
		for(Book ironman : booklist) {
			if(ironman.getTitle().equals("A Game of Thrones")) {
				System.out.println("Index of " + ironman.getTitle() + ":" + 
						booklist.indexOf(ironman));
			}
		}
		
		// Demo 7.5 - removing elements
		System.out.println(booklist.remove(1));
		System.out.println(booklist.remove(b));
		
		System.out.println(booklist);
		System.out.println(booklist.isEmpty());
	}

}
