package org.tsnif.decisionmakingstatement;

import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt();
		
		if(age>18 && weight>50) {
			System.out.println("You are eligible for blood donation");
		}
		else
		{
			System.out.println("not eligible");
		}
	}

}
