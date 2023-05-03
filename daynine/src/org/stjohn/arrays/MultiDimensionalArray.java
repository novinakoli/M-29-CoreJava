//program to demonstrate on multidimensional array
package org.stjohn.arrays;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int arr[][] = new int[2][3];//{{1,2,3},{4,5,6}}
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
