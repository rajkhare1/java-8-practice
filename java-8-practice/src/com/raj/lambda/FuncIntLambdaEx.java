package com.raj.lambda;

public class FuncIntLambdaEx {

	public static void main(String[] args) {
		// normal way of anonymous class implementation
		Runnable runObj = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable interface with normal anonymous class implementation...");
				
			}};
			
			runObj.run();
			
			// anonymous class implementation with Lambda
			Runnable runObjLambda = () -> {System.out.println("Runnable interface with Lambda implementation...");};
			runObjLambda.run();
	}
}
