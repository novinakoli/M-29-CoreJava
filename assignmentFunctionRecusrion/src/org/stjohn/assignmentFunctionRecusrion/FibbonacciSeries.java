//Write a program to find the nth term in the Fibonacci series using recursion.
package org.stjohn.assignmentFunctionRecusrion;

import java.util.Scanner;

public class FibbonacciSeries {
	 static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacci(n-1) + fibonacci(n-2);
	        }
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = sc.nextInt();
		System.out.println("Fibonacci series is: "+fibonacci(num));
		
		sc.close();

	}

}
