package demo6.comparable;

import demo1.lists.Book;

import java.util.Comparator;

public class CompareBooks implements Comparator<Book> {

	// Demo 7.18 - Comparator
	
	@Override
	public int compare(Book book1, Book book2) {
		
		if(book1.getPrice() < book2.getPrice()) {
			return 1;
		}
		else if(book1.getPrice() > book2.getPrice()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	

}
