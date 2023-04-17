package org.stjohn.singletonpattern;

public class EagerExecuter {

	public static void main(String[] args) {
		EagerPattern e1 = EagerPattern.getInstance();
		EagerPattern e2 = EagerPattern.getInstance();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
