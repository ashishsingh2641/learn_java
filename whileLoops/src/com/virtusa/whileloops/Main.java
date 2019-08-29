
package com.virtusa.whileloops;

/*
 * while loops for factorial numbers
 * 
 */

public class Main {
	public static void main(String[] args) {
		int Kval = 5;
		int factorial = 1;
		int sum = 1;
		while (Kval > 1) {
			factorial *= Kval;
			System.out.println(factorial);
			Kval--;
		}
		System.out.println(factorial);
		do {
			sum *= 2;
			System.out.println(sum);
		} while ( sum < 100);
	}
}
