package org.stjohn.interfacedemo;

public class InterfaceExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReceipeImplementable r = new ReceipeImplementable();
		r.setName("C2TC Program");
		System.out.println(r.displayName());
		
		NestedInterface n = new NestedInterface();
		n.setStr1("Nia");
		n.setStr2("Deshmukh");
		System.out.println(n.concatenate());
		
		
	}

}
