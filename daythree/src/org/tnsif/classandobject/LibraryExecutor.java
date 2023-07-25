//Driver class of Library Class
package org.tnsif.classandobject;

public class LibraryExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Call default constructor
		Library l = new Library();
		
		//Call Parameterized Constructor
		Library l2 = new Library(3,"Pratik","Cpp Programming",3000);
		System.out.println(l2);
		

	}

}
