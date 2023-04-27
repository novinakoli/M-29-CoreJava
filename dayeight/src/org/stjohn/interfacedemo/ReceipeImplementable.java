package org.stjohn.interfacedemo;

public  class ReceipeImplementable implements Receipe{
	private String Name;


	//getters and setters
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String displayName() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to C2TC Program");
		return Name;
	}
	
	
}
