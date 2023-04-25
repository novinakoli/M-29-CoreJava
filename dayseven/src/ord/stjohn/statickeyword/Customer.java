//program to demonstrate on static block and static method
package ord.stjohn.statickeyword;

public class Customer {
	private int custID;
	//static data member
	private static String companyName;
	//static block
	/*
	 * static block is used to initialize static
	 * variable only
	 */
	static {
		/*
		 * we cannot use non-static variable inside
		 * the static
		 */
		//custID = 18;
		
		companyName = "Amazon";
	}
	public Customer() {
		System.out.println("Default constructor");
		custID++;
	}
	@Override
	public String toString() {
		return "Customer [custID=" + custID + "]";
	}
	static void display() {
		System.out.println("companyname: "+companyName);
	}
}
