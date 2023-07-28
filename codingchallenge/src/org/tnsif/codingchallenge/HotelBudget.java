package org.tnsif.codingchallenge;

import java.util.Scanner;

public class HotelBudget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a rent of Hotel room : ");
		float rent = s.nextFloat();
		
		System.out.println("Enter a Number of day do u want to stay :");
		int day = s.nextInt();
		
		System.out.println("Enter Present Month (in number)");
		int month = s.nextInt();
		switch(month)
		{
		case 1:
			System.out.println(rent*day);			
			break;
			
		case 2:
			System.out.println(rent*day);
			break;
			
		case 3:
			System.out.println(rent*day);
			break;
			
		case 4:
			System.out.println(rent+(0.2*1500)*day);
			break;
			
		case 5:
			System.out.println(rent+(0.2*1500)*day);
			break;
			
		case 6:
			System.out.println(rent+(0.2*1500)*day);
			break;
			
		case 7:
			System.out.println(rent*day);
			break;
			
		case 8:
			System.out.println(rent*day);
			break;
			
		case 9:
			System.out.println(rent*day);
			break;
			
		case 10:
			System.out.println(rent*day);
			break;
			
		case 11:
			System.out.println(rent+(0.2*1500)*day);
			break;
			
		case 12:
			System.out.println(rent+(0.2*1500)*day);
			break;
		}

		
	}

}
