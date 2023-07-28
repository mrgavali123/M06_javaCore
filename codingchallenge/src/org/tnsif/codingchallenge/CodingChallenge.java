/*darshan is very much interesting in gardening and hence he plants more tree in garden.
he plants trees in a rectangular fashion with order of rows and columns 
and numbers trees in row wise order he planted a mango tree in first row first column and
last column given tree number(t) and row and column number (n) as a input
your task to find out whether given tree is a mango tree or not */

package org.tnsif.codingchallenge;

import java.util.Scanner;                                    

public class CodingChallenge {
	
	static void mango(int n, int t)
	{
		if(t%n==0 || t%n==1 || t<=n )
		{
			System.out.println("Mango Tree");
		}
		else
		{
			System.out.println("Not a mango Tree ");
		}
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {
			System.out.println("Enter a value of N and T (N is row and coloumn and T is a tree )");
			int n = s.nextInt();
			int t = s.nextInt();
			mango(n,t);
		}
		
		
	}

}
 