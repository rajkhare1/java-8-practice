package com.raj.java8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {
		//1. Integer Stream
		IntStream
			.range(1, 10)
			.forEach(p ->System.out.print(p));
		System.out.println();
		
		//2. Integer Stream with skip
				IntStream
					.range(1, 10)
					.skip(5)
					.forEach(p ->System.out.print(p));
				System.out.println();
				
		//3. Integer Stream with sum
				System.out.println(IntStream
					.range(1, 10)
					.sum());
				System.out.println();
				
				
		//4. Stream.of, sorted and findFirst
				Stream.of("Raj","Rahul","Richa")
					.sorted()
					.findFirst()
					.ifPresent(System.out::println);
	
	
	
	
	
	}
}
