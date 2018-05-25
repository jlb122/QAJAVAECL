package virtualExtensionMethods;

public class Foo implements Writer{
	// Demo 11.19 - A class that uses the Writer interface
	// Note that the write method has not been defined...
	public void doStuff() {
		write("Hello World");
	}
}
