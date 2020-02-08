package com.raj.sorting;

import java.util.ArrayList;
import java.util.Collections;

import com.raj.sorting.myutility.MyUtils;

public class IntegerSortingDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> integerList  =  new ArrayList<>();
		integerList.add(15);
		integerList.add(3);
		integerList.add(7);
		integerList.add(1);
		integerList.add(9);
		integerList.add(10);
		
		MyUtils.iterateList(integerList);
		
		Collections.sort(integerList);
		System.out.println("List after sort---------------------");
		
		MyUtils.iterateList(integerList);
		
	}

	

}
