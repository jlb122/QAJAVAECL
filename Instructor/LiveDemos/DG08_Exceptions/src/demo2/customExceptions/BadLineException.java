package demo2.customExceptions;

public class BadLineException extends Exception {
	
	String line;

	public BadLineException() {
		super("I didn't like the line I read in");
	}
	
	public BadLineException(String msg, String line) {
		super(msg);
		this.line = line;
	}
	
	public String getBadLine() {
		return line;
	}

}
