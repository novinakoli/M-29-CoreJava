//program to demonstrate on jagged array
package org.stjohn.arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		/*
		 * in jagged array inside array size are different
		 */
		Scanner sc= new Scanner(System.in);
		//declaring 2d rray with 2 rows
		int arr[][]=new int[2][];
		//making the above array jagged
		//1st block - first row has 3 elements
		arr[0]=new int[3];
		//2nd block - second row has 2 elements
		arr[1]=new int[2];

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//displaying the values of 2d jagged array
		System.out.println("Contents of 2d jagged array: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
