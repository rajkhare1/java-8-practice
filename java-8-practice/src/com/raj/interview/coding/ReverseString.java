package com.raj.interview.coding;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String original = "Hi I am the Raj";
		String reverse ="";
		
//		System.out.println("Enter the String to reverse:::: ");
//		Scanner scanner = new Scanner(System.in);
//		original = scanner.nextLine();
//		for(int i=original.length() -1; i >= 0; i--) {
//			reverse = reverse + original.charAt(i);
//		}
		
		StringBuffer sb = new StringBuffer(original);
		reverse = sb.reverse().toString();
		
		System.out.println("Original String: "+original);
		System.out.println("Reverse String: "+reverse);
	}
}
