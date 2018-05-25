package demo7.generics;

import demo1.lists.Book;

public class GenericClasses <T extends Animal> {
	
	T genericObject;
	
	public GenericClasses(T genericObject) {
		this.genericObject = genericObject;
	}
	
	public T getObject() {
		return genericObject;
	}
	
	public static void main(String[] args) {
		
		GenericClasses<Rabbit> an1 = new GenericClasses<Rabbit>(new Rabbit("Peter", 2, true));
		GenericClasses<Animal> an2 = new GenericClasses<Animal>(new Rabbit("Benjy", 3, false));
		GenericClasses<Book> an3 = new GenericClasses<Book>(new Book("GOT1", "GRRM", 6.99));
		
		System.out.println(an1.getObject());
		System.out.println(an2.getObject());
		System.out.println(an3.getObject());
	}

}
