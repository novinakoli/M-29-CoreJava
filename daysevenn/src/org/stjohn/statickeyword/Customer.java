package org.stjohn.statickeyword;

public class Customer {
	
	//non-static data member
	private int custID;
	//static data member
	private static String companyName;
	
	//static-block
	/*
	 * static block is used to initialize 
	 * static variable only
	 */
	static
	{
		/*we cannot use non-static variable 
		 * inside the static block.
		 * name="Abhinav"; 
		 */
		companyName="Myntra";
	}	
	
	public Customer() {
		System.out.println("Default constructor");
		custID++;
	}
	
		@Override
	public String toString() {
		return "Customer [custID=" + custID + "]";
	}

		static void display()
		{
			System.out.println("CompanyName :"+companyName);
		}
	
	
}