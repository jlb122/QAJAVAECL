package com.qa;

public class Person implements Comparable<Person>  {
	private String givenName;
	private String familyName;
	private int age;
	 // 3 arg constructor, getters and setters, etc. 
	
	public Person(String givenName, String familyName, int age) {
		super();
		this.givenName = givenName;
		this.familyName = familyName;
		this.age = age;
	}
	
	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override public int compareTo(Person other) {
		int otherAge = other.age;
		return this.age - otherAge;
	}
   
@Override public String toString() {
        return familyName + ", " + givenName + " [" + age + "]";
   }
	
}
