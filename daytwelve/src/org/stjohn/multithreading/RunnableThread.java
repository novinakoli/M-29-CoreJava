/*
 * program to demonstrate to create a thread by 
 * implementing a runnable interface
 */
package org.stjohn.multithreading;
//runnable methods contain run method
public class RunnableThread implements Runnable  {

	@Override
	public void run() {
		System.out.println("thread is in the running state");
		
	}

	public static void main(String[] args) {
		RunnableThread t = new RunnableThread();
		t.run();

	}


}
