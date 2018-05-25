package generics;

public class GenericClasses <T /* Demo 7.23 extends Animal*/>{
	
	T genericObject;
	
	public GenericClasses(T genericObject) {
		this.genericObject = genericObject;
	}
	
	public T getObject() {
		return genericObject;
	}

	public static void main(String[] args) {
		
		GenericClasses<Rabbit> an1 = new GenericClasses<Rabbit>(new Rabbit("Peter", 2, true));
		GenericClasses<Animal> an2 = new GenericClasses<Animal>(new Rabbit("Benjy", 3, true));
		GenericClasses<Book> an3 = new GenericClasses<Book>(new Book("GOT1", "A Game of Thrones"));
		
		System.out.println(an1.getObject());
		System.out.println(an2.getObject());
		System.out.println(an3.getObject());
	}

}
