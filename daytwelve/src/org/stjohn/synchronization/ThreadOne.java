package org.stjohn.synchronization;

public class ThreadOne extends Thread {
	Power p;

	//parameterized constructor
	public ThreadOne(Power p) {
		super();
		this.p = p;
	}
	
	public void run() {
		p.printPower(5);
	}
	
}
