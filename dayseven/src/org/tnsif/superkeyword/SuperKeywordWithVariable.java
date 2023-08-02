package org.tnsif.superkeyword;

class building{
	int floors = 23;
	String name = "DhanLaxmi";
}

class flat extends building{
	
	String name = "Pratik Gavali";
	void print()
	{
		/*if parent class and child class has variable name is same then 
		 * use super keyword for access both variable*/
		System.out.println(super.name);
		System.out.println(name);
	}
}
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flat f = new flat();
		//System.out.println(f.name);
		f.print();
	}

}
