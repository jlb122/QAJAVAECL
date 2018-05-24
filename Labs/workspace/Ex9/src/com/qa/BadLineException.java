package com.qa;

//11 a
public class BadLineException extends Exception {
	// b
	String line;

	// c
	public String getBadLine() {
		return line;
	}

	// d
	public BadLineException(String msg, String line) {
		super(msg);
		this.line = line;
	}
}
