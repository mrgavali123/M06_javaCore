//Program to demonstrate bunjee jumping using nested if else
package org.tsnif.decisionmakingstatement;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		
		if(age>=12) {
			if(weight>=50) {
				System.out.println("You are Eligible for bujnee jumping");
				if(weight>=110) {
					System.out.println("Extra ropes will be added ");
				}
				
			}
			else {
				System.out.println("You are not Eligible ");
			}
		}
		
		else {
			System.out.println("You are very small to try bunjee jumping please try later.......");
		}
		
		
	}

}
