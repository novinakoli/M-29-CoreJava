//program to demonstrate on for nested for loop
package org.stjohn.looping;

public class NestedForLoop {

	public static void main(String[] args) {
		//print star-square pattern
		int rows=4, columns=4;
		//nested for loop
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=columns; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
