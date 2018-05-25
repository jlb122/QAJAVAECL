package com.qa;

public class Pet {
	private String name, species;
	private Boolean fluffy;
	
	public Pet(String name, String species, Boolean fluffy) {
		this.name = name;
		this.species = species;
		this.fluffy = fluffy;
	}

	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	public Boolean getFluffy() {
		return fluffy;
	}
	
}
