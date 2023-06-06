//program to demonstrate on filtering
package org.stjohn.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> obj=Arrays.asList("Novina","Novina","Kirti","Vaishnavi","Priti");
        //filter
		obj.stream().filter((i->i.length()>5)).forEach((i)->System.out.println(i+" "));
	
        System.out.println();
        
        //distinct
        obj.stream().distinct().forEach((i)->System.out.println(i+" "));
	
        System.out.println();
        
        //limit
        obj.stream().limit(2).forEach((i)->System.out.println(i+" "));
    	
        System.out.println();
        
        //skip
        obj.stream().skip(3).forEach((i)->System.out.println(i+" "));
    	
	
	}
	

}
