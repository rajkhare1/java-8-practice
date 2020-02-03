package com.raj.lambda;

public class FirstLambdaExp {
	public static void main(String[] args) {
		// create a thread with old way in java programming
		// CASE - 1
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("In run method, without lambda expression");
				
			}
		}).start();
		
		// now create the above code using lambda expression
		// CASE - 2
		new Thread(() -> System.out.println("In run method, lambda expression")).start();
		
	}

}
