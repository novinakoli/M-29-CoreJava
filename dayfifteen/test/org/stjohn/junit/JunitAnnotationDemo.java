/*
 * program to demostrate on different annotation
 * which is used in JUnit5
 */
package org.stjohn.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotationDemo {

	@Test
	void display() {
		System.out.println("First JUnit Method");
	}

	@Test
	/*
	 * denotes that the annotated method should be execued before all test methods
	 */
	@BeforeAll
	void print() {
		System.out.println("Performing BeforeAll annotation");
	}

	@Test
	/*
	 * denotes that the annotated method should be
	 * executed after each test method
	 */
	@AfterEach
	void accept() {
		System.out.println("AfterEach method is executed");
	}
}
