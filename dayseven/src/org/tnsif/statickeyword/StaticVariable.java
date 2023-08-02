package org.tnsif.statickeyword;
class Employee{
	private int EmpID;
	private String Name;
	private static String Company = "TnsIF";
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public static String getCompany() {
		return Company;
	}
	public static void setCompany(String company) {
		Company = company;
	}
	
	public void display() {
		System.out.println("Emp Id is :"+this.EmpID+" Name is : "+this.Name+" Company Name is : "+this.Company);
	}
}
public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		e.setEmpID(1);
		e.setName("Pratik");
		e.display();
	}

}
