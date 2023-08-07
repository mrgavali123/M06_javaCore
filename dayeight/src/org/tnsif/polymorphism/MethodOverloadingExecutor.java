package org.tnsif.polymorphism;
class Bollywood{
	//Method Overloading in terms of by passing the different arguments
	String showCouple(String str1,String str2)
	{
		return str1+" Loves "+str2;
	}
	
	String showCouple(String str1,String str2, String str3)
	{
		return str1+" Loves "+str2+" as well as "+str3;
	}
}
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bollywood b = new Bollywood();
		System.out.println(b.showCouple("Salman", "Aishwarya"));
		System.out.println(b.showCouple("Salman", "Aishwarya"," Katrina"));

	}

}