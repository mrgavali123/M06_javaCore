package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MicrowaveProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number of item");
		int item = s.nextInt();
		
		System.out.println("Enter required time");
		float time = s.nextFloat();
		
		switch(item) 
		{
			
		case 1:
			System.out.println(time);
			break;
		
		case 2:
			System.out.println(time+(time/2));
			break;
	
		case 3:
			System.out.println(time*2);
			break;
			
		default:
			System.out.println("Not Recommended");
			
			
		}
	
	}

}
