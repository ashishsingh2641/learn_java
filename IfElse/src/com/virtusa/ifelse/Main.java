/*
 * odd even using if else
 */

package com.virtusa.ifelse;

public class Main {
	public static void main(String[] args) {
		int i = 100;
		int a,b,c;
		a = 4;
		b = 9;
		c = 8;
		if (i % 2 == 0) {
			System.out.println(i + " is a even number");
		} else {
			System.out.println(i + " is odd number");
		}
		
		if (a > b && a > c) {
			System.out.println(a + " is greater then  b  and c ");
		}else if (b > a && b > c ) {
			System.out.println(b + " is greater then a  and c ");
		}else {
			System.out.println(c + " is greater then  a  and c ");
		}
	}
}
