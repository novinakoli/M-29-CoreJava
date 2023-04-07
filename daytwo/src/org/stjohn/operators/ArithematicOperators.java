package org.stjohn.operators;

import java.util.Scanner;

//program to demonstrate on arithmatic operator
public class ArithematicOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("The addition is: "+(x+y));
		System.out.println("The substraction is: "+(x-y));
		System.out.println("The multiplication is: "+(x*y));
		System.out.println("The division is: "+(x/y));
		System.out.println("The modulo is: "+(x%y));
		sc.close();
	}

}
