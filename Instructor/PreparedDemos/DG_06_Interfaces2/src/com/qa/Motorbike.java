package com.qa;

public class Motorbike extends Vehicle implements IsDrivable {
	
	private int wheels;
	
	public Motorbike(String make, String model, String colour, String fuelType, int wheels) {
		super(make, model, colour, fuelType);
		// TODO Auto-generated constructor stub
		this.wheels = wheels;
	}

	@Override
	public void accelerate() {
		
		this.setSpeed(this.getSpeed() + 20);
	}

	@Override
	public void brake() {
		
		this.setSpeed(this.getSpeed() - 10);
	}

	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return wheels;
	}
	
}
