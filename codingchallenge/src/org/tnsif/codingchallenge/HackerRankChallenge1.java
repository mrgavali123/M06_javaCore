package org.tnsif.codingchallenge;

class Arithmatic{
	int add(int a, int b) {
		return a+b;
	}
}

class Adder extends Arithmatic{
	
}
public class HackerRankChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder a = new Adder();
		System.out.println(a.add(4, 6));
	}

}
