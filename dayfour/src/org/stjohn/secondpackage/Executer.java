package org.stjohn.secondpackage;
import org.stjohn.firstpackage.*;
public class Executer {

	public static void main(String[] args) {
		Base b1 = new Base();
		/*
		 * if any method is default we cannot access into another package
		 * we can access only inside the same package
		 */
		//b1.mathodDefault();
		b1.methodPublic();
	}

}
