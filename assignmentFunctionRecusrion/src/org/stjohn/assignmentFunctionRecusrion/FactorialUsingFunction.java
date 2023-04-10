package org.stjohn.assignmentFunctionRecusrion;

import java.util.Scanner;

//factorial using function
public class FactorialUsingFunction {
	static int factorial(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=i*fact;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = sc.nextInt();
		System.out.println("Factorial is: "+factorial(num));

	}

}
