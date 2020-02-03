package com.raj.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapDebug {

	public static void main(String[] args) {
		
		// creating two strings which give same hashcode for replicate hash collosion
		String s1 = "FB";
		String s2 = "Ea";
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
//		map.put("aaa",1);
//		map.put("bbb",2);
//		map.put("ccc",3);
//		map.put("ddd",4);
		
		//now try to replicate hash collision
//		map.put(s1, 1);
//		map.put(s2, 2);
		
		//now try to put duplicate key
//		map.put("bb",1);
//		map.put("bb",2);//show it will just update the latest value.
		
		//Check for loadFactor and threshold
		map.put("a",1);
		map.put("b",1);
		map.put("c",1);
		map.put("d",1);
		map.put("e",1);
		map.put("f",1);
		map.put("g",1);
		map.put("h",1);
		map.put("i",1);
		map.put("j",1);
		map.put("k",1);
		map.put("l",1);
		
		map.put("m",1);
		
		
		
		
		
	}
}