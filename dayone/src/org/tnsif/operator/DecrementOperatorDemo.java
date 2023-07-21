//Program to demonstrate increment and decrement operator
package org.tnsif.operator;

public class DecrementOperatorDemo {
	public static void main(String[] args) {
		int x = 34,y = 6;
		int res1 = x++ + ++y;
		System.out.println(res1);
		System.out.println(x);
		System.out.println(y);
		
		int res2 = x-- + --y;
		System.out.println(res2);
		System.out.println(x);
		System.out.println(y);
	}
}
