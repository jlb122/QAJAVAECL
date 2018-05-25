package virtualExtensionMethods;

public class Main {

	public static void main(String[] args) {
		
		// Demo 11.21 - Making Foo
		
		Foo f = new Foo();
		f.doStuff();
		
		// Demo 11.22 - Making Bar
		Bar b = new Bar();
		b.doStuff();
		
		// Demo 11.23 - Mixing types
		
		Foo fb = new Bar();
		fb.doStuff();
		
		System.out.println(fb.getClass());

	}

}
