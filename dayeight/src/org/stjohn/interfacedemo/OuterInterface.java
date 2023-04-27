//program to demonstrate on nested interface
/*
 * nested interface - inside an interface there will be an
 * another interface
 */
package org.stjohn.interfacedemo;

public interface OuterInterface {
	int sum();
	interface InnerInterface{
		String concatenate();
		
	}
}
