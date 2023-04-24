//program to demonstrate on constructor overloading
package org.stjohn.constructoroverloading;
public class ConstructorOverloading {
	private int x;
	private int y;
	
	//constructor overloading
	public ConstructorOverloading() {
		System.out.println("Default Constructor");
	}
	//
	public ConstructorOverloading(int x) {
		System.out.println("parameterized Constructor "+x);
	}
	//
	public ConstructorOverloading(int x, int y) {
		System.out.println("parameterized Constructor: "+x+y);
	}
}
