package org.stjohn.annotations;

public class DeprecatedAnnotationDemo {
	/*
	 * it allows any elements no longer to be used
	 */
	@Deprecated
	public void print() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		DeprecatedAnnotationDemo d = new DeprecatedAnnotationDemo();
		d.print();
	}
}
