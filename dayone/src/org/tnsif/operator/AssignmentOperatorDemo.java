//Program to demonstrate on assignment operator
package org.tnsif.operator;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 12, y=7;
		//a-=y;
		
		System.out.println(x-=y); // x = x-y
		System.out.println(x+=y); // x = x+y
		System.out.println(x*=y); // x = x*y
	}

}
