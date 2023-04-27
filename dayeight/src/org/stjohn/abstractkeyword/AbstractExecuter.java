package org.stjohn.abstractkeyword;

public class AbstractExecuter {

	public static void main(String[] args) {
		/*
		 * if any class contains abstract method,
		 * we can't create that class
		 */
		//Remote r = new Remote();
		RemoteChild r = new RemoteChild();
		r.cellName ="Durocell";
		r.display();
		r.functionRemote();
		
	}

}
