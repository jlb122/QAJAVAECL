package com.qa;

import java.util.ArrayList;
import java.util.stream.IntStream;


public class Main {

	public static void main(String[] args) {

	}

	public void FuncExercise() {
		// 1
		IntStream years = IntStream.range(1960, 2018);
		years
				// 2
				.filter(y -> (y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
				// 3
				.forEach(System.out::println);

		// 4
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Person("Trevor", 13, 13299.29));
		personList.add(new Person("Dave", 80, 19299.29));
		personList.add(new Person("Tony", 60, 23299.29));
		personList.add(new Person("Rebecca", 53, 89299.29));
		personList.add(new Person("Hannah", 29, 9299.29));

	}
}
