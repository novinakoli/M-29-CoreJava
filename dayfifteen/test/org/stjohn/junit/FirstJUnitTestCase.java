package org.stjohn.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstJUnitTestCase {

	/*
	 * @Test annotation is used to perform the testing on the given
	 * test method
	 */
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("Hello, This is simple Testing")
	void display() {
		System.out.println("First JUnit Method");
	}

}
