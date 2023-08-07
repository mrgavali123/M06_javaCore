//it can be passed as a argument in the method call
package org.tnsif.thiskeyword;

class Team{
	 int size;
	 Team(){
		this(7);//----> This constructor first call parameterized constructor 
		System.out.println("Default Constructor");
	 }
	 Team(int size){
		 System.out.println("Parameterized Constructor : "+size);
	 }
}
public class ThisKeywordDemoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team t = new Team();
		
	}

}
