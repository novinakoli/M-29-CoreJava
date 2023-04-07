package org.stjohn.decisionmaking;
//program to demonstrate the if--else condition
import java.util.Scanner;

public class IfElse {
/*
 * if we use two condition to decide then we will use if--else
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age and weight: ");
		int age = sc.nextInt();
		int weight = sc.nextInt();
		if(age>18 && weight>50) {
			System.out.println("Eligible to donate");
		}
		else {
			System.out.println("Not eligible to donate");
		}
	}

}
