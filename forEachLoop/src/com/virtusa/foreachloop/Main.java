package com.virtusa.foreachloop;

public class Main {
	public static void main(String[] args) {
		//for(loop-variable-declaration:array) 
		//statement;
		
		float[] theVals = {10.0f, 20.0f, 15.0f};
		float sum = 0.0f;
		for(float currentData: theVals)
			sum +=currentData;
		
		System.out.println(sum);
	}
}
