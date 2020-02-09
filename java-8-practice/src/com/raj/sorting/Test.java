package com.raj.sorting;

class Human {}

class Doctor extends Human {}

class Animal {}

class Dog extends Animal{}

class Bird{}

public class Test {

	public static <T extends Human> void printInfo(T humanObject) {
		System.out.println("You are Human...");
	}
	
	public static void main(String[] args) {
		printInfo(new Human());
		printInfo(new Doctor());
		//printInfo(new Animal()); This will give the compile time error
	}
}
