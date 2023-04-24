package org.stjohn.methodoverriding;
//parent class
public class RBI {
	public float getInterestRate() {
		return 3.8f;
	}
}
class HDFC extends RBI{
	public float getInterestRate() {
		System.out.println(super.getInterestRate());
		return 12.5f;
	}
}