//program to demonstrate on this keyword
package org.stjohn.thiskeyword;

public class ThisKeyword {
	//private data members
	private int CVVNo;
	private long ATMNo;
	//parameterized constructor
	public ThisKeyword(int cVVNo, long aTMNo) {
		super();
		/* step -> 1 --using this keyword
		 * it can be used to return the current class instance
		 */
		this.CVVNo = cVVNo;
		this.ATMNo = aTMNo;
	}
	//user-defined method
	public void print() {
		System.out.println("CVV No is: "+CVVNo+" "+"ATM No is: "+ATMNo);
	}
	
}
