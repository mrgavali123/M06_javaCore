package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	static String name;
	int a;
	
	static
	{
		name = "Pratik";
		/*Static block is use to initialize only static variable we cannot initialize
		non static variable in static block*/
		//a = 69;
		System.out.println(name);
	}
	
	static void display()
	{
		System.out.println(name);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		display();
	}

}