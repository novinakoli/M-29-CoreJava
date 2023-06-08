package org.stjohn.junit;

import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {
	/*
	 * to perform parameterized test
	 */
	@ParameterizedTest
	@ValueSource(strings= {"Novina","Kirti","Vishnavi"})
	void test() {
		System.out.println("Parameterized Test"+" Test");
	}

	@ParameterizedTest
	@ValueSource(strings= {"sonu","monu"})
	void accept(String str) {
		assertNotNull(str);
	}

}
