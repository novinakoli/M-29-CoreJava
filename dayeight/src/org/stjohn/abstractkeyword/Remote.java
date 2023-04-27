package org.stjohn.abstractkeyword;

/*
 * if any class contains atleast one abstract method then that class
 * must be declare as an abstract class
 */
public abstract class Remote {
 public String cellName;
	/*
	 * abstract class can have contain abstract and non-abstract method
	 */

	// abstract method
	abstract void functionRemote();

	// concrete method
	public void display() {
		System.out.println("cell name is: " + cellName);
	}
}

// implementable class
class RemoteChild extends Remote {
	@Override
	void functionRemote() {
		System.out.println("Abstract class is implemented");
	}
}

