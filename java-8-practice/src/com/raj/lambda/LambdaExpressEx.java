package com.raj.lambda;

import java.util.function.BinaryOperator;

public class LambdaExpressEx {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 5;
		
		int sum = calulate(i, j, (r,k) -> {return r+k;} );
		System.out.println("sum: "+sum);
		
		int subtract = calulate(i,j, (r,k) -> {return r - k;});
		System.out.println("subtract:"+subtract);
		
		
	}
	
	public static int calulate(int i, int j, BinaryOperator<Integer> bo) {
		return bo.apply(i, j);
	}
}
