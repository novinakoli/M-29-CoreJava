//program to demonstrate on class, object and constructor
//driver class
package org.stjohn.classandobject;

import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id;
		String city, name;
		System.out.println("Enter the customer ID: ");
		id = s.nextInt();
		//to read the nextline
		s.nextLine();
		System.out.println("Enter the name: ");
		name = s.nextLine();
		System.out.println("Enter the city: ");
		city = s.nextLine();
		
		//object creation
		//default constructor invoked
		Customer c = new Customer();
		c.setCity(city);
		c.setCustomerID(id);
		c.setCustomerName(name);
		//below statement call tostring method
		System.out.println(c);
		
		//parameterized constructor invoked
		Customer c1 = new Customer(id, name, city);
		System.out.println("Enter the customer ID: ");
		id = s.nextInt();
		//to read the nextline
		s.nextLine();
		System.out.println("Enter the name: ");
		name = s.nextLine();
		System.out.println("Enter the city: ");
		city = s.nextLine();
		System.out.println(c1);

	}

}
