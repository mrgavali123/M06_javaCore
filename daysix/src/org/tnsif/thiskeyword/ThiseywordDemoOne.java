//Program to demonstrate on:
//This keyword is used to refer current instance of a class
package org.tnsif.thiskeyword;
class account{
	long accountNo;
	
	void setData(long accountNo)
	{
		this.accountNo= accountNo; 
	}
	void display() {
		System.out.println(accountNo);
	}
}

public class ThiseywordDemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account a = new account();
		a.setData(123456789);
		a.display();
	}

}
