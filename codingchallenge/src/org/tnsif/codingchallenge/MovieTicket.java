package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MovieTicket {
	
	void movieticket(int age, float time) 
	{
		if (age >13) {
			System.out.println("Your Ticket Price is $8.00 ");
		}
		else if(age<12 && age>=9) {
			System.out.println("Your Ticket Price is $5.00");
		}
		else if(age<9 && age>=5) {
			System.out.println("Your Ticket Price is $4.00");
		}
		else {
			System.out.println("Your Ticket Price is $2.00");

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = s.nextInt();
		
		System.out.println("Enter Present Time : ");
		float time = s.nextFloat();
		
		MovieTicket m = new MovieTicket();
		m.movieticket(age, time);
	}

}
