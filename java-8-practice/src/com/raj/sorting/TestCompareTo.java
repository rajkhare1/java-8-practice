package com.raj.sorting;

public class TestCompareTo {

	public static void main(String[] args) {
		
		// a comes before x so it always give -ve integer value
		System.out.println("a".compareTo("x"));
		
		//-ve integer
		System.out.println("b".compareTo("d"));
		
		//+ve if the current object is greater than the specified object
		System.out.println("d".compareTo("a"));
		
		System.out.println("g".compareTo("c"));
		
		// zero if the current object is equal to the specified object
		System.out.println("d".compareTo("d"));
		
		System.out.println(new Integer(20).compareTo(200));
		System.out.println(new Integer(200).compareTo(20));
		System.out.println(new Integer(20).compareTo(20));

	}
}
