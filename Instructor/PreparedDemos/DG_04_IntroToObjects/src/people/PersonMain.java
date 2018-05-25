package people;

public class PersonMain {

	public static void main(String[] args) {
		// Demo 4.07 - Using Encapsulation
		
		Person person = new Person();
		
		person.setName("Freddie");
		
		System.out.println("person's name is: " + person.getName());

		//System.out.println(person.name);
	}

}
