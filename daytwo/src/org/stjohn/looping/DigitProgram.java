package org.stjohn.looping;

public class DigitProgram {

	public static void main(String[] args) {
		int num=1234, i=0;
		do {
			num = num/10;
			i++;		
		}while(num != 0);
		System.out.println("Digit of a given number is: "+i);
	}

}
