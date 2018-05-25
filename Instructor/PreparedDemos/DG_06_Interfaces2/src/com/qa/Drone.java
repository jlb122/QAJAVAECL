package com.qa;

public class Drone extends Vehicle {

	private int altitude;
	private int rotation;
	
	public Drone(String make, String model, String colour, String fuelType) {
		super(make, model, colour, fuelType);
		this.altitude = 0;
		this.rotation = 0;
	}

	public void attainAltitude(int altToAttain) {
		
		while(altitude != altToAttain) {
			if(altitude < altToAttain) {
				altitude++;
			}
			else {
				altitude--;
			}
		}
	}
	
	public int getRotation() {
		return rotation;
	}

	public void setRotation(int rotation) {
		this.rotation = rotation;
	}
	
	@Override
	public String toString() {
		return super.toString() + "; Altitude: " + altitude;
	}

	
}
