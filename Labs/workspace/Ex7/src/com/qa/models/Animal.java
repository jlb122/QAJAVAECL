package com.qa.models;


public abstract class Animal implements Comparable  {

	//private fields
	private String name;
	private int age;

	//constructor
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//setters and getters for name and age
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	//abstract methods, the animal class doesn't know
	//how to implement these. We need some concrete
	//instantiations
	public abstract String sayHello();

	public abstract String move();
	
	public String toString(){
		return "Name: " + name + " Age: " + age;
	}
	
	public int compareTo(Object o){
		Animal a = (Animal) o;
		
		if (this.getAge() < a.getAge()) return -1;
		else if (this.getAge() > a.getAge()) return 1;
		else return 0;
				
	}
	
}