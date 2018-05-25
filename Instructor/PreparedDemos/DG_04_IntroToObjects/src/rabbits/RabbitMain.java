package rabbits;

public class RabbitMain {

	public static void main(String[] args) {
		// Demo 4.03 Create an instance of Rabbit
		Rabbit thumper = new Rabbit("Thumper", 2, "white");
		
		// Output the object details
		System.out.println(thumper);
		
		// Demo 4.05 - Create Flopsy
		Rabbit flopsy = new Rabbit("Flopsy", 22, "grey");
		System.out.println("Flopsy is " + flopsy.getAge());

	}

}
