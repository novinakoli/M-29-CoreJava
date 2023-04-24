package org.stjohn.methodoverloading;
//driver class
public class MethodOverloadingExecuter {

	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		System.out.println(m1.multiplication(12.4f, 3.7f));
		System.out.println(m1.multiplication(3.4f, 12));
		System.out.println(m1.multiplication(23,18.2f));
		System.out.println(m1.multiplication(18, 22));
		System.out.println(m1.print("welcome to TNSIF"));
		System.out.println(m1.print("Novina", "koli"));
	}

}
