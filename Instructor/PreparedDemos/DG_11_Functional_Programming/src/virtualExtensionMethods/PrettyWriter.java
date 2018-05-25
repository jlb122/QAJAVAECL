package virtualExtensionMethods;

public interface PrettyWriter extends Writer {
	
	// Demo 11.18 - Another Interface with a Virtual Extension Method
	
	@Override
	public default void write(String msg) {
		System.out.println("**** " + msg + " ++++");
	}
}
