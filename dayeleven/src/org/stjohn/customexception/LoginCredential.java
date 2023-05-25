//program to demonstrate on custom exception or user defined
package org.stjohn.customexception;

//to create a custom exception we need to extend an exception class
public class LoginCredential extends Exception  {
	//private data members
	private String str1;
	
	//parameterized constructor
	public LoginCredential(String str1) {
		super();
		this.str1 = str1;
	}

	@Override
	public String toString() {
		return "LoginCredential [str1=" + str1 + "]";
	}
	
}
