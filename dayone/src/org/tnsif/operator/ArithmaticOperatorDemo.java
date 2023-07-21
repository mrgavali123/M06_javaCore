package org.tnsif.operator;

import java.util.Scanner;

public class ArithmaticOperatorDemo {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {
			System.out.println("Enter First Number : ");
			
			int num1 = s.nextInt();
			
			System.out.println("Enter Second Number : ");
			int num2 = s.nextInt();
			System.out.println(num1+num2);
			System.out.println(num1-num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);
			System.out.println(num1%num2);
		}
	}

}

