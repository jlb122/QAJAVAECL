package animals;

public class AnimalMain {

	public static void main(String[] args) {
		
		// Demo 6.04 Using the classes
		
		Animal animal = new Animal("Fido", 12);
		
		System.out.println(animal);
		
		Cat cat = new Cat("Tinker", 4, true);
		
		System.out.println(cat);
		
		// Demo 6.10 - Calling Overloaded Methods
		System.out.println(cat.sayHello());
		
		System.out.println(cat.sayHello("You"));

	}

}
