package com.virtusa.switcheample;

public class Main {
	public static void main(String[] args) {
		int iVal = 47;
		switch(iVal % 2) {
		case 0:
			System.out.println(iVal);
			System.out.println(" is even");
			break;
		case 1: 
			System.out.println(iVal);
			System.out.println(" is odd ");
			break;
		default:
			System.out.println(" Not a Number ");

		}
	}
}
