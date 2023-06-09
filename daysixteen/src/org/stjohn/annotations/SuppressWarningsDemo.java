package org.stjohn.annotations;

import java.util.*;
public class SuppressWarningsDemo {
/*
 * we can remove the warnings using below annotations
 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Set s=new TreeSet();
		s.add(12);
		s.add(23);
		s.add("Novi");
		System.out.println(s);

	}

}
