//program to demonstrate on stream
package org.stjohn.streamapi;

import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(11, 26, 78, 90);
		s1.forEach((i)->System.out.println(i+" "));;

	}

}
