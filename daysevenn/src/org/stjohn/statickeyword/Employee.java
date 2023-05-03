package org.stjohn.statickeyword;
//program to demonstrate on Static variable
public class Employee {
	
	//non-static private data members
	private int empID;
	private String empName;
	
	//static data members
	static String companyName= "TNS India Foundation";

	//parameterized constructor
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}

}