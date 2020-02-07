package com.raj.concurrency;

public class Counter {
	
	private int i =0;
	
	synchronized public void increment() {
		i++; // 15
		// get the value i 15 15
		// increment 
		// set the value of i 16
		// i is not atomic operation so we need synchronized for thread safety
		// thread safety means once thread at a time successfully update the value so we wont miss the some update
	}

	public int getI() {
		return i;
	}
	
	

}
