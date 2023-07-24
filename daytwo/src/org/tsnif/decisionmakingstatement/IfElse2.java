package org.tsnif.decisionmakingstatement;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("This is a leap year :"+year);
				}
				else {
					System.out.println("This is not leap year  ");
				}
			}
			else 
			{
				System.out.println("This is a leap year : "+year);
			}
		}
		else {
			System.out.println("This is not leap year  ");
		}
	}

}
