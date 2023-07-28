package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI s = new SBI();
		s.setAccountNo(12345);
		s.setAccType("Saving Account ");
		s.setAtmCardNo(123568);
		s.setPinNo(9669);
		System.out.println("Account Number is : "+s.getAccountNo());
		
//		System.out.println(s);
	}
	

}
