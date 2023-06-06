//program to demonstrate Synchronization
package org.stjohn.synchronization;
//driver class
public class SynchronizationExample {

	public static void main(String[] args) {
		Power p=new Power();
		ThreadOne t1=new ThreadOne(p);
		ThreadTwo t2=new ThreadTwo(p);
		t1.start();
		t2.start();
	}

}
