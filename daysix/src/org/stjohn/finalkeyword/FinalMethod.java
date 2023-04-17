//program to demonstrate on final method
//parent class
package org.stjohn.finalkeyword;

public class FinalMethod {
	//default constructor
	public FinalMethod() {
		System.out.println("Default Constructor");
	}
	//final variable
	final float salary = 27000.89f;
	//final method
	final void show() {
		System.out.println("Salary is: "+salary);
	}
}
