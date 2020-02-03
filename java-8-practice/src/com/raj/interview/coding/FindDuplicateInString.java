package com.raj.interview.coding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicateInString {

	public static void main(String[] args) {
		
		// Need to find the duplicate in below String
		String str = "sia sia sia is my my my daughter";
		String charStr = "rrrrrrrlkkkkjkljluuuu";
		
		//findDuplicateWord(str);
		findDuplicateCharacter(charStr);
	}

	private static void findDuplicateWord(String str) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//1. split the string
		String[] splits = str.split(" ");
	     for(String split: splits) {
	    	  if(map.get(split) != null) {
	    		  map.put(split, map.get(split)+1);
	    	   } else {
	    		   
	    		   map.put(split, 1);
	    	   }
	     }// end of for loop
	     
	     Iterator<String> itr = map.keySet().iterator();
	     while(itr.hasNext()) {
	    	 String tempString = itr.next();
	    	 if(map.get(tempString)>1) {
	    		 System.out.println("The word '"+tempString+"' is duplicate found "+map.get(tempString)+" times in the string");
	    	 }
	     }
	}
	
	private static void findDuplicateCharacter(String charStr) {
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(int i=0; i<charStr.length(); i++) {
			char ch = charStr.charAt(i);
			if(charMap.get(ch) !=null) {
				charMap.put(ch,charMap.get(ch)+ 1);
			} else {
				charMap.put(ch, 1);
			}
		}//end of for loop
		System.out.println(charMap);
		
		Iterator<Character> itr = charMap.keySet().iterator();
		while(itr.hasNext()) {
			char tempChar = itr.next();
			if(charMap.get(tempChar) > 1) {
				System.out.println("The character '"+tempChar+"' is duplicate found "+charMap.get(tempChar)+" times in the string");
			}
		}
	}
}
