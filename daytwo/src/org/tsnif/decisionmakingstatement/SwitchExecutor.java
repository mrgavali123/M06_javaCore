//Program for Switch case
package org.tsnif.decisionmakingstatement;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Choice : ");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Baadal Barsa Bichuli");
				break;
		
			case 2:
				System.out.println("Jay Shree Ram");
				break;
			
			case 3:
				System.out.println("Shape of You");
				break;
				
			default:
				System.out.println("Invalid Loop");
		
		}

	}
	
	
	
}