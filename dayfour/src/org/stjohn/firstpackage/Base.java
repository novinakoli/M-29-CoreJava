//program to demonstrate on packages and access modifier
package org.stjohn.firstpackage;

public class Base {
	/*
	 * declaring all the access specifier with variables
	 */
	int varDefault = 18;
	public String varPublic = "Novina";
	private int varPrivate = 2221;
	protected float varProtected = 234.56f;
	
	/*
	 * declaring all the access specifier with methods
	 */
	
	void methodDefault() {
		System.out.println("Default access method: "+varDefault);
	}
	
	public void methodPublic() {
		System.out.println("Public access method: "+varPublic);
	}
	
	private void methodPrivate() {
		System.out.println("Private access method: "+varPrivate);
	}
	protected void methodProtected() {
		System.out.println("Protected access method: "+varProtected);
	}
	
	
}
