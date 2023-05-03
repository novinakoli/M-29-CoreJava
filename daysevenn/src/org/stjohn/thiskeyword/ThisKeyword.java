//program to demonstrate on this keyword
package org.stjohn.thiskeyword;
public class ThisKeyword {
	
	//private data members
	private int cvvNo;
	private int atmNo;

	//parameterized constructor
	public ThisKeyword(int cvvNo, int atmNo) {
		/*It can be used to return the current 
		 * class instance
		 */
	
		this.cvvNo = cvvNo;
		this.atmNo = atmNo;
	}
	//user-defined method
	public void print()
	{
		System.out.println("CVV no is :"+cvvNo+" "
				+"ATM Card No is:"+atmNo);
	}
}