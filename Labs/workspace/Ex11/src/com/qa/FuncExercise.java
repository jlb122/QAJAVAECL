package com.qa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FuncExercise {

	public static void main(String[] args) {
		new FuncExercise();
	}

	public FuncExercise() {
		// 1
		IntStream years = IntStream.range(1960, 2015);
		years
		// 2
		.filter(y -> (y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
		// 3
				.forEach(System.out::println);

		// 5
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Eve", 19, 10000));
		personList.add(new Person("Alice", 24, 15000));
		personList.add(new Person("Dave", 27, 48000));
		personList.add(new Person("Mallory", 42, 18000));
		personList.add(new Person("Ami", 50, 50000));
		personList.add(new Person("Bob", 39, 17000));

		// 6
		List<Person> increasedSalary = personList
				.stream()
				.filter(p -> p.getAge() > 30 && p.getSalary() < 20000)
				.map(p -> {
					return new Person(p.getName(), p.getAge(),
							p.getSalary() * 1.10);
				}).sorted()
				// .forEach(System.out::println);
				.collect(Collectors.toList());

		// 7
		System.out.println(personList
				.stream()
				.filter(p -> p.getAge() < 30)
				.collect(
						Collectors.summarizingDouble((Person p) -> p
								.getSalary())).getAverage());
		System.out.println(personList
				.stream()
				.filter(p -> p.getAge() > 30)
				.collect(
						Collectors.summarizingDouble((Person p) -> p
								.getSalary())).getAverage());

		// 8
		ArrayList<Integer> intList = new ArrayList<Integer>(IntStream
				.range(0, 10).boxed().collect(Collectors.toList()));

		ArrayList<Integer> newIntList = applyFunctions(intList,
				(Integer i) -> i = i + 1, (Integer i) -> i = i * 2);

		newIntList.forEach(System.out::println);

		//12-14 test
		new a().Log("Hello world");
		new b().Log("Hello World");
		new c().Log("Hello World");
	}

	// 8
	public ArrayList<Integer> applyFunctions(ArrayList<Integer> input,
			Function<Integer, Integer> f, Function<Integer, Integer> g) {

		return new ArrayList<Integer>(input.stream().map(f).map(g)
				.collect(Collectors.toList()));

		// return null;

	}

	// 9
	public interface Logger {
		public void Log(String msg);
	}

	// 10
	public interface ConsoleLogger extends Logger {
		public default void Log(String msg) {
			System.out.println(msg);
		}
	}

	// 11
	public interface TimeWriter extends Logger {
		public default void Log(String msg) {
			LocalDateTime today = LocalDateTime.now();
			System.out.println(today + "::" + msg);
		}
	}

	// 12
	public class a implements ConsoleLogger {
	}

	// 13
	public class b implements TimeWriter {
	}

	// 14
	public class c implements ConsoleLogger, TimeWriter {
		public void Log(String msg) {
			TimeWriter.super.Log(msg);
		}
	}

}
