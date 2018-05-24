package com.qa;

/**
 * Class to hold information about a book
 * @author Kat
 */
public class Book {
	
	private String name;
	private String[] authors;
	private double price;

	/**
	 * Constructor for book
	 * @param name String title of the book
	 * @param authors String array up to five authors
	 * @param price double price of the book
	 */
	public Book(String name, String[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	/**
	 * Returns the title of the book
	 * @return String title
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the title of the book
	 * @param name String title
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get all the authors 
	 * @return String array of Authors
	 */
	public String[] getAuthors() {
		return authors;
	}

	/**
	 * Set the authors of the book, replaced the old array entirely
	 * Will only accept up to 5 authors in the array, otherwise an 
	 * error is thrown and no change is made
	 * 
	 * @param authors array of authors to replace the current set
	 */
	public void setAuthors(String[] authors) {
		if (authors.length <= 5) {
			this.authors = authors;
		} else {
			System.out
					.println("Error, you can only have up to five authors. Change not made");
		}
	}

	/**
	 * Get the price of the book
	 * @return double price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * set the price of the book
	 * @param price new price of the book
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Add an individual author to the list of authors of the book
	 * Will print an error if there are already 5 listed authors
	 * @param author the author to add to the array
	 */
	public void addAuthor(String author) {
		if (authors.length <= 5) {
			authors[authors.length] = author;
		} else {
			System.out
					.println("Error, you can only have up to five authors. Change not made");
		}
	}

	/**
	 * toString method for the class, returns the object in the form
	 * Book: [Title, Author1, Author2, .... , Price]
	 */
	public String toString(){
		String str = "Book: [" + name + ", ";
		
		for(int x = 0; x < authors.length; x ++){
			str += authors[x] + ", ";
		}
		
		str += price + "]";
		
		return str;
	}
	

}
