//program to demonstrate on date-time
package org.stjohn.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate obj1 = LocalDate.of(2000, 12, 23);
		System.out.println(obj1);
		
		LocalDateTime obj2 = LocalDateTime.now();
		System.out.println(obj2);
		
		LocalDate obj3 = LocalDate.now();
		System.out.println(obj3);
		
		ZonedDateTime obj4 = ZonedDateTime.now();
		System.out.println(obj4);
		
		OffsetTime obj5 = OffsetTime.now();
		System.out.println(obj5);
		
		OffsetDateTime obj6 = OffsetDateTime.now();
		System.out.println(obj6);
		
		
	
	}

}
