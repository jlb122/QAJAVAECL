package com.qa;

public class Car extends Vehicle implements IsDrivable, hasPassengers{

	private int wheels;
	private int passengers = 0;

	public Car(String make, String model, String colour, String fuelType, int wheels) {
		super(make, model, colour, fuelType);
		// TODO Auto-generated constructor stub
		this.wheels = wheels;
	}

	@Override
	public void accelerate() {
		this.setSpeed(this.getSpeed() + 10);

	}

	@Override
	public void brake() {
		this.setSpeed(this.getSpeed() - 10);

	}

	@Override
	public void setPassengers(int passengers) {

		this.passengers = passengers;
	}

	@Override
	public int getPassengers() {

		return passengers;
	}


	public void cruiseAtSixty() {

		while(this.getSpeed() != 60) {
			if(this.getSpeed() < 60) {
				accelerate();
			}
			else {
				brake();
			}
		}
	}

	@Override
	public String toString() {
		return super.toString() + "; Passengers : " + passengers;
	}

	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return wheels;
	}
}
