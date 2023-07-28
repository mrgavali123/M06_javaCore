/*There are N people standing in a circle waiting to be executed.
 * the counting out begins at some point in a circle and proceeds around 
 * a circle in fix direction. 
 * In each step a certain number of people are skipped and the next person is executed. 
 * The elimination proceed around the circle in the (Which is becoming smaller and smaller
 * as the executed people are removed ), until only the last person remains, who is given freedom
 * Given : Total number of person N and a number Kth which indicate that k-1 person are skipped and
 * Kth person killed in circle the task is to choose the person in initial person that survived
 *  
 *   */
package org.tnsif.dayfourchallenge;

import java.util.Scanner;

public class CircleSurviveChallenge {
	
	static int survive(int n , int k)
	{
		if(n==1) 
			return 1;
		
		
		else
			return (survive(n-1,k)+k-1)%n+1;
		//return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of N and K");
		int n = s.nextInt();
		int k = s.nextInt();
		System.out.println(survive(n,k));
		
	}

}
