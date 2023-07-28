//Program to demonstrate on access specifier
//Driver class
package in.kkwagh.library;

import in.bkcmet.library.library;
//import in.bkcmet.library.*; ---> TO import all package

public class FacultyExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		library l = new library();
		l.libraryName= "MET-BKC LIBRARY";
		l.displayPublic();
		
		/* User ID and displayPrivate() Method is private so i
		 * it is not accessible we cannot access in another class
		 * only we can access in same class */
//		l.userId =234543;
		//l.displayPrivate();
		
		/* We can access default method in same package not in 
		 * another package */
		
//		l.booksName1;
//		l.displayDefault();
	}

}
