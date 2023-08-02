//Program to demonstrate on static method
package org.tnsif.statickeyword;

public class StaticMethodExecutor {
	
	static float percentage = 67.90f;
	String str= "BKC";
	
	static void displayScore(int score)
	{
		System.out.println(percentage);
		System.out.println("Score is : "+score);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayScore(45);
		
		/*We a=cant use non static variable inside static method*/
//		System.out.println(str);
		
	}

}
