package com.raj.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {
	
	static <X> X doubleValue(X value) {
		return value;
	}
	
	static <X extends List> void duplicateList(X list) {
		list.addAll(list);
	} 

	static double sumOfAnyList(List<? extends Number> numbers) {
		double sum = 0.0;
		for(Number number: numbers) {
			sum = sum + number.doubleValue();
		}
		return sum;
	}
	
	static void addCoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}
	public static void main(String[] args) {
		
		List emptyList = new ArrayList<Number>();
		addCoupleOfValues(emptyList);
		System.out.println(emptyList);
		
		System.out.println(sumOfAnyList(List.of(1,2,3,4,5)));
		System.out.println(sumOfAnyList(List.of(1.1,2.1,3.1,4.1,5.1)));
		System.out.println(sumOfAnyList(List.of(1l,2l,3l,4l,5l)));
		
		
		String value1 = doubleValue(new String());
		Integer number1 = doubleValue(Integer.valueOf(5));
		ArrayList list1 = doubleValue(new ArrayList());

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
		duplicateList(numbers);
		System.out.println(numbers);
		
//		MyCustomList<String> myCustomList = new MyCustomList<String>();
//		myCustomList.addElement("Element 1");
//		myCustomList.addElement("Element 2");
//		String value = myCustomList.get(0);
//		System.out.println("value: "+value);
		
		MyCustomList<Long> myCustomList = new MyCustomList<>();
		myCustomList.addElement(5l);
		myCustomList.addElement(7l);
		Long value = myCustomList.get(0);
		System.out.println("value: "+value);
		
		System.out.println(myCustomList);
		
		MyCustomList<Integer> myCustomList2 = new MyCustomList<Integer>();
		myCustomList2.addElement(Integer.valueOf(5));
		myCustomList2.addElement(Integer.valueOf(7));
		Integer number = myCustomList2.get(0);
		System.out.println("number: "+number);
		
		System.out.println(myCustomList2);
	}

}
