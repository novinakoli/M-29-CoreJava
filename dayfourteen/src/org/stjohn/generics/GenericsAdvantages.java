package org.stjohn.generics;

import java.util.*;
public class GenericsAdvantages {

	public static void main(String[] args) {
		//1. type-safety
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(23);
		//list.add(23.5);
		System.out.println(list);
		
		//2. Before generics, Typecasting is allowed
		ArrayList arr1=new ArrayList();
		arr1.add("St.John");
		System.out.println(arr1);
		String str = (String)arr1.get(0);
		System.out.println(str);
		
		//2. In generucs, Typecasting is not necessary
		ArrayList arr2=new ArrayList();
		arr2.add("St.John");
		System.out.println(arr2);
		Object str1 = arr2.get(0);
		System.out.println(str1);
		

	}

}
