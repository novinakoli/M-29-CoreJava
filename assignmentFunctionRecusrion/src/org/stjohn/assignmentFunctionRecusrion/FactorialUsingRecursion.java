package org.stjohn.assignmentFunctionRecusrion;

import java.util.Scanner;

//factorial using recursion
public class FactorialUsingRecursion {
	static int factorial(int num) {
		if(num!=0) {
			return num*factorial(num-1);
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = sc.nextInt();
		System.out.println("Factorial is: "+factorial(num));
		
		sc.close();
	}

}
