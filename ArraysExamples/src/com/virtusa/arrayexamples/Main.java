package com.virtusa.arrayexamples;

public class Main {
	public static void main(String[] args) {
		float[] a = {0.0f, 1.0f, 2.0f};
//		a[0] = 0.0f;
//		a[1] = 150.0f;
//		a[2] = 2.0f;
		float sum = 0.0f;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}	
		System.out.println(sum);
	}
}
