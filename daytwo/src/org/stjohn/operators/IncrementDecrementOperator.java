package org.stjohn.operators;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		int a=12,b=5;
		int x=a++; //12
		++a; //++13 ->14
		--b;
		int y=b--;
		System.out.println(x);
		System.out.println(a);
		System.out.println(y);
		System.out.println(b);

	}

}
