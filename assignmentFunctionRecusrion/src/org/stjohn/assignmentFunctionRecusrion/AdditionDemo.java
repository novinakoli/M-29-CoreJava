package org.stjohn.assignmentFunctionRecusrion;

import java.util.Scanner;

//to demonstrate program on function
public class AdditionDemo {
	//function definition
/*	static int Addition(int x, int y) {
		int sum=x+y;
		return sum;
	}*/
	
	static void Addition(int x, int y) {
		int sum=x+y;
		System.out.println("Addition is: "+sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of x and y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Addition(x,y); //function call

		sc.close();
	}

}
