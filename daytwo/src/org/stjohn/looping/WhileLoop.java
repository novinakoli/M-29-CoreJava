//program to demonstrate on while loop
package org.stjohn.looping;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
	int i=1;
	System.out.println("Enter the numbers: ");
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	while(i<=N) {
		System.out.print(i+" ");
		i++;
	}
	}

}
