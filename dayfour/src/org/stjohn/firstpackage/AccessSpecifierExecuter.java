package org.stjohn.firstpackage;

public class AccessSpecifierExecuter {

	public static void main(String[] args) {
		Base b = new Base();
		b.methodDefault();
		b.methodPublic();
		b.methodProtected();
		/*
		 * private members we can't access into another class
		 */
		//b.methodPrivate();
		System.out.println(b instanceof Base);
	}

}
