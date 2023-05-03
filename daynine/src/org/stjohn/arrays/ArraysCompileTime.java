//program to demonstrate on simple array program
package org.stjohn.arrays;

public class ArraysCompileTime {

	public static void main(String[] args) {
		//compile time
		int arr[]= {12,6,90,67};
		/*
		 * if we access 4th index,
		 * we will get exception "ArrayIndexOutOfBoundException",
		 * as we are accessing 4th index and that is not present in the array
		 */
		//System.out.println(arr[4]);
		System.out.println("Array of: "+ arr[2]);
		//enhanced loop
		for(int i: arr) {
			System.out.print(i+" ");
		}

	}

}
