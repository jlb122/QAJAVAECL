package demo2.virtualExtensionMethods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo f = new Foo();
		
		f.doStuff();
		
		Bar b = new Bar();
		b.doStuff();
		
		Foo fb = new Bar();
		fb.doStuff();
		
		System.out.println(fb.getClass());
		System.out.println(fb instanceof Foo);
		System.out.println(fb instanceof Bar);
		System.out.println(b instanceof Foo);
		System.out.println(b instanceof Bar);
		System.out.println(f instanceof Foo);
		System.out.println(f instanceof Bar);
	}

}
