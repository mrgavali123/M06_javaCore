package org.tnsif.superkeyword;
class Google
{
	String ceo;

	public Google(String ceo) 
	{
		System.out.println("Ceo is : " + ceo);
	}	
}

class Gmail extends Google
{
	String userID;
	public Gmail(String ceo, String userID)
	{
		super(ceo);
		this.userID = userID;
		System.out.println("UserID is : "+userID);
	}

}
public class SuperKeywordWithConstructor 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Gmail g = new Gmail("Sundar Pichai", "1234567");
	
	}
}
