/*ask a user as a birth year encoded as two digit like( "03")
 & for current year also encoded as two digit like ("23") 
 write a program to find user current age in years*/
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class AgeCalculator {
	static void ageCalci(int Cy, int By) {
		
		if(Cy>By)
			System.out.println(Cy-By);
		else
			System.out.println((100-By)+Cy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Current year and Birth Year");
		int Cy = s.nextInt();
		int By = s.nextInt();
		ageCalci(Cy,By);
	}

}
