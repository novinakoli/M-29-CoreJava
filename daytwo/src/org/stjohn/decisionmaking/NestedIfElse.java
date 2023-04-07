package org.stjohn.decisionmaking;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0) {
			if(num<0) {
				System.out.println("Zon-sero number");
			}
			else {
				System.out.println("Zero/Non-zero number");
			}
		}
		else {
			System.out.println("either zero/non-zero number");
		}

	}

}
