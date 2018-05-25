package qa;

public class E_Strings {

	public static void main(String[] args) {
		// Demo 2.09 - Strings
		String hello = "Hello ";
		String world = "World";

		String greeting = hello + world;
		System.out.println(greeting);

		// Demo 2.10 - Strings and other variables
		String start = "My age is ";
		int age = 21;

		String complete = start + age;
		System.out.println(complete);

		// Demo 2.11 - Comparing Strings
		System.out.println(hello.equals(world));

		String world2 = "world";
		System.out.println(world.equalsIgnoreCase(world2));

	}

}
