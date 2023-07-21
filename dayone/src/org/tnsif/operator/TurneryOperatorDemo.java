//Program to demonstrate on ternary operator
package org.tnsif.operator;

import java.util.Scanner;

public class TurneryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		String result = (num%2==0)?"Even" : "Odd";
		System.out.println("Number is : " + result);
		s.close();
	}

}
