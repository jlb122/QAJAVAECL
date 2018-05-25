package qa;

public class Dog extends Animal implements GuideDog{	
	
	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	// Demo 6.14 - Implementing an Interface
	@Override
	public String crossRoad() {
		// Implementation Here
		return "Safely done";
	}

	@Override
	public boolean working() {
		// Implementation Here
		return true;
	}

	
	
}
