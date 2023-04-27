//program to demonstrate on functional interface
/*
 * functional interface - an interface which contains exactly one abstract method
 */
package org.stjohn.interfacedemo;
//below annotation tell us that interface must have one abstract method
@FunctionalInterface
public interface Receipe {
	/*by default all the methods inside an
	 * interface are public abstract and variable are 
	 * public static final
	*/
	//abstract method
	String displayName();
	//String print(); -->it will give error bcoz two abstract methods are not allowed.
	
}
