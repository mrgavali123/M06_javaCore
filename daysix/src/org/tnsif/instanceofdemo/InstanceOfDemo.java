package org.tnsif.instanceofdemo;

class RBI
{
	protected String ifscCode;
}

class SBI extends RBI
{
	
	public SBI() {
		super.ifscCode = "RBIS0NGPA01";
		String ifscCode=  "SBIN0002161";
		
		System.out.println(ifscCode);
		/*If parent class and child class variable are same name 
		 * in such case use super variable name to access that variable
		 *  of parent class inside the child class  */
		System.out.println(super.ifscCode);

	}

}
public class InstanceOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();
		
		//it return true value...........
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);

	}

}
