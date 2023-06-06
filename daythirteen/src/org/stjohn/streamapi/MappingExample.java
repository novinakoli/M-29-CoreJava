//program to demonstrate on map operation

package org.stjohn.streamapi;

import java.util.Arrays;
import java.util.List;

public class MappingExample {

	public static void main(String[] args) {
		// using collections
		List<String> obj=Arrays.asList("Novina","Kirti","Vaishnavi","Priti");
		obj.stream().map(i->i.length()).forEach((i)->System.out.print(i+" "));

	}

}
