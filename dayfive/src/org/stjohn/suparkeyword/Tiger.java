package org.stjohn.suparkeyword;

public class Tiger extends Animal {
	
	public String animalType="tiger";
	public int noOfLegs=4;
	
	public void display() {
		//super method
		super.display();
		//super variable
		System.out.println(super.animalType);
		System.out.println(super.noOfLegs);
		System.out.println("Animal type: "+animalType);
		System.out.println("No. of legs: "+noOfLegs);
	}
	
	public Tiger() {
		//invoking the parent class constructor
		//it calls parents class default constructor
		super();
		System.out.println("Tiger class constructor Child class");
	} 
	
	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}

	


	
	
	
}
