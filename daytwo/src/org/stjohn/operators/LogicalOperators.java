package org.stjohn.operators;
//program to demonstrate on logical operator

public class LogicalOperators {

	public static void main(String[] args) {
		boolean result1 = (5>2) && (4==3);
		boolean result2 = (5>2) || (4==3);
		boolean result3 = !(4<=3);
		System.out.println(result1); //false
		System.out.println(result2); //true
		System.out.println(result3); //true
		
	}

}
