//program on demonstrate to singleton pattern using eager initalization
package org.stjohn.singletonpattern;

public class EagerPattern {
	//create private constructor
	private static EagerPattern INSTANCE = new EagerPattern();
	
	//create private static variable of the same class
	private EagerPattern() {
		
	}
	//create public static method that returns instance of the class
	public static EagerPattern getInstance() {
		return INSTANCE;
	}
}
