package com.raj.sorting;

import java.util.ArrayList;
import java.util.Collections;

import com.raj.sorting.myutility.MyUtils;

public class StringSortingDemo {

	public static void main(String[] args) {
		
		ArrayList<String> musicList = new ArrayList<>();
			musicList.add("zara zara");
			musicList.add("besabriya");
			musicList.add("kaise hua");
			musicList.add("aeisa desh hai mera");
			musicList.add("koi lauda de woh pyare pyare din");
			
			MyUtils.iterateList(musicList);
			Collections.sort(musicList);
			System.out.println("after sort--------------------");
			MyUtils.iterateList(musicList);
		
	}

	
}
