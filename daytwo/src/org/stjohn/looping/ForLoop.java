//program to demonstrate on for loop
package org.stjohn.looping;
 
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		//print 1 to N numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			System.out.print(i+" ");
		}
	}

}
