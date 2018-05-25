package animals;

public class Cat extends Animal {
	// Demo 6.02 - Inherit from Animal
	private boolean fluffy;

	public Cat(String name, int age, boolean fluffy) {
		super(name, age);
		this.fluffy = true;
	}
	
	public boolean isFluffy() {
		return fluffy;
	}
	
	// Demo 6.03 - Overriding Superclass Methods
	@Override
	public String toString() {
		return "Cat: " + super.toString();
	}
	
	// Demo 6.09 - Overloading Methods
	
	public String sayHello() {
		return "Hello!";
	}
	
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
