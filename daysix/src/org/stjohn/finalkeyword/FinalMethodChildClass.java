package org.stjohn.finalkeyword;

public class FinalMethodChildClass extends FinalMethod{
	//final variable
	public int num = 275;
	
	/*
	 * final method can't be override, we will get compile time error
	 */
	/*final method override
		final void show() {
			System.out.println("Salary is: "+salary);
		}
		*/
	//final method
	//method overloading
	final void show(int num) {
		System.out.println("Number is: "+num);
	}
	
}
