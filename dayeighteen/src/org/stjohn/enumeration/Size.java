package org.stjohn.enumeration;

public enum Size implements pizza{
	SMALL,MEDIUM,LARGE;

	public void displaySize() {
		System.out.println("Size: "+this);
		
	}
}
