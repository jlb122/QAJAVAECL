package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		
		// Demo 11.11 - Streams
		// Collections have new method stream()
		// Converts collection into stream of values
			
		myList
			.stream()						// Start the stream
			.map(String::toUpperCase)		// Demo 11.12 - Map the stream - take each element and apply function to it
			.filter(s -> s.startsWith("C"))	// Demo 11.13 - Filter the list
			.sorted()						// Demo 11.14 - Sort the list
			.forEach(System.out::println);	// Output myList
		
		// Demo 11.15a - Collect - gather output of map and filter and collect in required form
		List<Integer> mapFilterList = intList
											.stream()
											.map(i -> i * i)
											.filter(i -> i % 2 == 0)
											.collect(Collectors.toList());
		System.out.println(mapFilterList);
		
		// Demo 11.15b - Collect
		String total = intList
								.stream()
								.map(i -> i * i)
								.filter(i -> i % 2 == 0)
								.collect(Collectors.summarizingInt(i -> i))
								.toString();
		System.out.println("Statistics: " + total);
		
		// Demo 11.16 - Reduce - reduce stream according to function
		Integer reducedList = intList.stream().reduce(1, (x, a) -> a * x);
		System.out.println("Output: " + reducedList);
	}

}
