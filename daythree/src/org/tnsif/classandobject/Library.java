//Program to demonstrate on default and parameterized constructor
package org.tnsif.classandobject;

public class Library {
	//Public data members
	public long noOfBooks;
	public String authorName;
	public String bookName;
	public double price;
	
	//Default Constructor
	public Library() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor ");
	}
	
	//Parameterized constructor
	public Library(long noOfBooks, String authorName, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
		System.out.println("Parameterized Constructor ");
		
	}

	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	
	
}
