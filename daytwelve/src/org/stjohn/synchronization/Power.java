//program to demonstrate on synchronization
package org.stjohn.synchronization;
//calculating the power
public class Power {
	synchronized void printPower(int num) {
		int x = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" "+ num + "^" + i + "value: " + num * x);

			x = num * x;

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
