/**
 * 
 */
package com.virtusa.mathclass;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random dice = new Random();
		int number = 0;
		for (int i = 0; i <= 10; i++) {
			number =  1 + dice.nextInt(6);
		}
		System.out.println(number);
	}

}
