//Write a program to find the sum of digits in a number using recursion.

package org.stjohn.assignmentFunctionRecusrion;

import java.util.Scanner;

public class SumOfDigit {
	static int sumofdigit(int n)
	{
	    if (n == 0)
	    return 0;
	    return (n % 10 + sumofdigit(n / 10));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = sc.nextInt();
		int digit = sumofdigit(num);
		System.out.println("Sum of digit is: "+digit);
		
		sc.close();
	}

}
