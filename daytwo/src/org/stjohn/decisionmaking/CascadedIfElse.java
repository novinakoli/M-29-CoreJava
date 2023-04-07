package org.stjohn.decisionmaking;

import java.util.Scanner;

public class CascadedIfElse {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the percentage: ");
	float p1 = sc.nextFloat();
	float p2 = sc.nextFloat();
	float p3 = sc.nextFloat();
	if(p1>p2 && p1>p3) {
		System.out.println("P1 has higher percentage");
	}
	else if(p2>p3 && p2>p1) {
		System.out.println("P2 has higher percentage");
	}
	else {
		System.out.println("P3 has higher percentage");
	}

	}

}
