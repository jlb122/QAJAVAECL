package demo2.virtualExtensionMethods;

public interface PrettyWriter extends Writer {
	
	@Override
	public default void write(String msg) {
		System.out.println("***** " + msg + "*****");
	}

}
