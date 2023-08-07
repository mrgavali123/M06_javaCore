package org.tnsif.interfaceexecuter;
//This is a implementable class for sony
public class SonyTV implements sony {
	
	/*Provide an implementation to all an abstract method*/
	@Override
	public void display()
	{
		System.out.println("CID");
		System.out.println(NoOfChannels);
	}
}
