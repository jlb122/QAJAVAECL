package qa;

public class Dog2 extends Animal implements RetiredGuideDog {
	
	public Dog2(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	// Demo 6.16 - Implementing RetiredGuideDog
	@Override
	public String crossRoad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean working() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String retirement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRetired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	
}
