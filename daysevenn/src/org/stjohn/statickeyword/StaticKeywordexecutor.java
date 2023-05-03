package org.stjohn.statickeyword;

public class StaticKeywordexecutor {

	public static void main(String[] args) {
		/*
		 * Without creating the object,we will 
		 * get the value for static variable 
		 */
		System.out.println(Employee.companyName);
		Employee e = new Employee(101,"Nova Koli");
		System.out.println(e);
		
		Employee e1 = new Employee(102," Pritaa Ghodke");
		System.out.println(e1);
		
		Customer.display();
		Customer c = new Customer();
		System.out.println(c);
		

	}

}