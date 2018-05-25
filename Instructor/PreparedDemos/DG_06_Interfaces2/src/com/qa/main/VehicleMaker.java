package com.qa.main;

import com.qa.Car;
import com.qa.Drone;
import com.qa.Motorbike;
import com.qa.Taxi;
import com.qa.Vehicle;

public class VehicleMaker {

	public static void main(String[] args) {
		
		// Work with the Drone Class
		Drone drone1 = new Drone("Amazon", "Deliverer", "Black", "Battery");
		// Set altitude
		drone1.attainAltitude(100);
		// Set rotation
		drone1.setRotation(90);
		// String out
		System.out.println(drone1);
		
		// Work with the Car Class
		Car car1 = new Car("Ford", "Mustang", "Red", "Petrol", 4);
		
		car1.setPassengers(4);
		
		System.out.println(car1);
		
		car1.cruiseAtSixty();		
		System.out.println("car1's speed after running cruiseAtSixty is: " + car1.getSpeed());
		
		car1. accelerate();
		System.out.println("car1's speed now is: " + car1.getSpeed());
		
		car1.cruiseAtSixty();		
		System.out.println("car1's speed after running cruiseAtSixty is: " + car1.getSpeed());	
		
		// Work with the Motorbike Class
		Motorbike bike1 = new Motorbike("Kawasaki", "Ninja", "Green", "Petrol", 2);
		
		System.out.println(bike1);
		
		for(int i = 0; i < 5; i++) {
			bike1.accelerate();
		}
		
		System.out.println("bike1's speed after accelerating is " + bike1.getSpeed());
		
		// Work with the Taxi Class
		Taxi taxi1 = new Taxi("Skoda", "Octavia", "Silver", "Diesel", 4);
		
		taxi1.setPassengers(5);
		taxi1.setFareRate(2.25);
		
		System.out.println(taxi1);
		
		System.out.println("**** What class is taxi1? ****");

		if(taxi1 instanceof Vehicle) { 
			System.out.println("taxi1 is a Vehicle");
		}
		
		if(taxi1 instanceof Car){
			System.out.println("taxi1 is a Car");
		}
		
		if(taxi1 instanceof Taxi){
			System.out.println("taxi1 is a Taxi");
		}
		
	}

}
