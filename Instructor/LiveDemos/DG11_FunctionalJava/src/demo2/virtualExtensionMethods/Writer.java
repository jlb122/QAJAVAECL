package demo2.virtualExtensionMethods;

public interface Writer {

	public default void write(String msg) {
		System.out.println(msg);
	}
}
