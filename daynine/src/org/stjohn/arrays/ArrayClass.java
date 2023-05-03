//program to demonstrate on arrays class
package org.stjohn.arrays;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		//array initialization
		int array[]= {78, 12, 19, 22, 23};
		//to print all the elements
		System.out.println(Arrays.toString(array));
		//sorting the array
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}

}
