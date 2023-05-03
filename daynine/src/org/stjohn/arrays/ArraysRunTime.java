//program to demonstrate on simple array program
package org.stjohn.arrays;
import java.util.Scanner;
public class ArraysRunTime {

	public static void main(String[] args) {
		System.out.println("Enter the no. of elements: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//array declaration
		int arr[]=new int[num];
		//array initialization
		for(int i=0; i<num; i++) {
			arr[i]=sc.nextInt();
		}
		//printing the array
		for(int itr:arr) {
			System.out.println("Array elements are: "+itr);
		}
	}

}
