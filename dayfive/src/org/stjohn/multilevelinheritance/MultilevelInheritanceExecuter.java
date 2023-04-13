//program to demonstrate on multilevel inheritance
package org.stjohn.multilevelinheritance;
//driver class
public class MultilevelInheritanceExecuter {

	public static void main(String[] args) {
		City c = new City();
		c.setCityName("Mumbai");
		c.setArea("Gateway of India");
		c.setStateName("Maharashtra");
		c.setLanguage("Marathi");
		c.setCountryCapital("Delhi");
		c.setCountryName("India");
		System.out.println(c);

	}

}
