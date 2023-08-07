package org.tnsif.interfaceexecuter;
//Program to demonstrate an interface
public interface sony {
	/*By default all the variable inside an interface is 
	 * public static and final*/
	int NoOfChannels = 8;
	//By default all the method inside an interface is abstract
	void display();
	
	/*Core java version 8 provide static and default method inside interface*/
	//This is a static method
	static void accept()
	{
		System.out.println("Static Method");
	}
	
	//This is a default method
	default void show()
	{
		System.out.println("Default Method");
	}
}
