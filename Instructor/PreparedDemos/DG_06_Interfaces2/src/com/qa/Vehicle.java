package com.qa;

public abstract class Vehicle {

	private String make;
	private String model;
	private String colour;
	private String fuelType;
	private int speed = 0;

	public Vehicle(String make, String model, String colour, String fuelType) {

		this.make = make;
		this.model = model;
		this.colour = colour;
		this.fuelType = fuelType;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Type: " + this.getClass() + "; Make: " + make + "; Model: " + model + "; Colour: " +
				colour + " Fuel: " + fuelType;
	}

}
