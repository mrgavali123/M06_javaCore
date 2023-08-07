package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MovieTicket {
	
	void movieticket(int age, float time) 
	{
		if(age>13)
		{
			if(time>=13.30 && time<=17.59) {
				System.out.println("$5");
			}
			else {
				System.out.println("$8");
			}
		}
		
		if(age<=13)
		{
			if(time>=13.30 && time<=17.59) {
				System.out.println("$2");
			}
			else {
				System.out.println("$4");
			}
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
