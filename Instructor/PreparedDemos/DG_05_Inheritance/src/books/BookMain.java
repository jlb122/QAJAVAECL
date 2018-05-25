package books;

public class BookMain {

	public static void main(String[] args) {
		// Demo 6.11 - Using Overloaded Constructors
		
		Book book1 = new Book();
		
		Book book2 = new Book("GOT1", "Game of Thrones");
		
		Book book3 = new Book("GOT2", "A Clash of Kings", "George RR Martin", 7.99);
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
	}

}
