package com.qa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.qa.model.*;

public class Main {

	public static void main(String[] args) {
		// 1
		Cat felix = new Cat("Felix", 12);
		Dog buddy = new Dog("Buddy", 5);
		Dog teddy = new Dog("Teddy", 99);
		Rabbit tony = new Rabbit("Tony", 20);
		Rabbit peter = new Rabbit("Peter", 15);

		// 2
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(felix);
		animalList.add(buddy);
		animalList.add(teddy);
		animalList.add(tony);
		animalList.add(peter);

		for (Animal inThisList : animalList) {
			System.out.println(inThisList);
		}

		ArrayList<Cat> catList = new ArrayList<>();
		catList.add(felix);
		// catList.add(buddy); // error!
		// catList.add(teddy); // error!

		// 3
		HashMap<String, Animal> animalMap = new HashMap<>();

		// Put items into animalMap
		animalMap.put(felix.getName(),felix);
		animalMap.put(buddy.getName(),buddy);
		animalMap.put(teddy.getName(),teddy);
		animalMap.put(tony.getName(),tony);
		animalMap.put(peter.getName(),peter);


		System.out.println("Hash Map Elements where name is key");
		System.out.println("\t" + animalMap);
		System.out.println("Order by key hash");
		
		HashMap<Animal, String> animalMap2 = new HashMap<>();

		// Put items into animalMap
		animalMap2.put(felix,"fluffy");
		animalMap2.put(buddy,"small");
		animalMap2.put(teddy,"noisy");
		animalMap2.put(tony,"annoying");
		animalMap2.put(peter,"evil");


		System.out.println("Hash Map Elements where object is key");
		System.out.println("\t" + animalMap2);
		System.out.println("Order by key hash");

	}

}
