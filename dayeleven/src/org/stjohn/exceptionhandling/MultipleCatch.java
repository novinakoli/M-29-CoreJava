//program to demonstrate on multiple catch block
package org.stjohn.exceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		int arr[] = new int[] { 101, 33, 78 };
		System.out.println("Array is: ");

		// we can use multiple catch block
		/*
		 * try { System.out.println(arr[3]); } catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Exception handled"+e); } catch(ArithmeticException e) {
		 * System.out.println("Exception handled"+e); }
		 */

		/*
		 * we can pass multiple exception name insider the same catch block using pipe
		 * operator (|)
		 */
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e);
		}

	}

}
