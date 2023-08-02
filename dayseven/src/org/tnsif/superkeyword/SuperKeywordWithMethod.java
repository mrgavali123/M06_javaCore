package org.tnsif.superkeyword;

class MET{
	String ownerName = "Chagan Bhujbal";
	void display()
	{
		System.out.println("Owner Name is : "+ownerName);
	}
}
class BKC extends MET{
	String ownerName = "Shefali Bhujbal";
	void display()
	{
		/* If parent and child class has same method name
		 *  then use super keyword to access parent class 
		 * method in child class */
		super.display();
		System.out.println("Owner Name is : "+ownerName);
	}
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BKC b = new BKC();
		b.display();
	}

}
