package org.tnsif.polymorphism;

class ChiefMinister
{
	
	static void corruption(String str1,float amount)
	{
		System.out.println(str1+" is a corrupted Person and has amount : "+amount);
	}
}

class MLA extends ChiefMinister
{
	
	static void corruption(String str2,float amount2)
	{
		
		ChiefMinister.corruption("Darshan Nikam", 400000.0f);
		System.out.println(str2+" is a corrupted Person and has amount : "+amount2);
	}
}
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MLA.corruption("Kiran shinde", 120000.0f);

	}

}
