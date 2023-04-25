//program to demonstrate on static variable
package ord.stjohn.statickeyword;

public class Employee {
	// non-static private data members
	private int empID;
	private String empName;

	// static data members
	static String companyName = "Apple";

	// parameterized constructor
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}

	// tostring method
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}

}
