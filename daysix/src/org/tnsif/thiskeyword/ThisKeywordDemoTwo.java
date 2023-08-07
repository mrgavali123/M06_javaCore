//it can be use to invoke or initiate current class constructor
package org.tnsif.thiskeyword;
class Bank
{
	long accountNo;

	Bank(long accountNo) {
		this.accountNo = accountNo;
	}
	
	void display()
	{
		System.out.println(accountNo);
	}
}
public class ThisKeywordDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank(1234567);
		b.display();
	}

}
