package org.stjohn.collections;

import java.util.ArrayList;

public class ArrayListDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
			
		   @SuppressWarnings("rawtypes")
		ArrayList list=new ArrayList(); //Raw list - Heterogenous
			list.add(10);
			list.add(40);
			list.add(34.78);
			list.add(3400888l);
			list.add(true);
			list.add('A');
			list.add("Nashik");
			
			System.out.println(list);
			ArrayList<String> list1=new ArrayList<String>(); //Homogenous
			list1.add("Aniket");
			list1.add("Nikhil");
			list1.add("Pooja");
		//	list1.add(true);
			System.out.println(list1);
 }
}
