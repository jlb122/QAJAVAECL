package demo7.generics;

public class Rabbit extends Animal {
	
	private boolean fluffy;

	public Rabbit(String name, int age, boolean fluffy) {
		super(name, age);
		this.fluffy = fluffy;
	}

	public boolean isFluffy() {
		return fluffy;
	}

	@Override
	public String toString() {
		return "Rabbit [fluffy=" + fluffy + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	

}
