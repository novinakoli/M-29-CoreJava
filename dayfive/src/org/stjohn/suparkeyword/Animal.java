package org.stjohn.suparkeyword;

public class Animal {
	public String animalType="wild-animal";
	public int noOfLegs=2;
	
	public void display() {
		System.out.println("Animal type: "+animalType);
		System.out.println("No. of legs: "+getNoOfLegs());
	}

	
	public Animal() {
		System.out.println("Animal class constructor Parent class");
	}

	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noOfLegs=" + getNoOfLegs() + "]";
	}


	public int getNoOfLegs() {
		return noOfLegs;
	}


	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
}
