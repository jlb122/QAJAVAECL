package com.qa;

public class Taxi extends Car implements hasPayingPassengers{
	
	private double fareRate;
	
	public Taxi(String make, String model, String colour, String fuelType, int wheels) {
		super(make, model, colour, fuelType, wheels);
	}

	@Override
	public void setFareRate(double fareRate) {
		
		this.fareRate = fareRate;
	}

	@Override
	public double getFareRate() {
		
		return fareRate;
	}
	
	@Override
	public String toString() {
		return super.toString() + "; Fare rate: " + fareRate;
	}
	

}
