package com.virtusa.simpleintrest;

import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		double p;
		double n;
		double r;
		double si;
		
		sc = new Scanner(System.in);
		System.out.println(" Please Enter the principle Amount");
		p = sc.nextDouble();
		System.out.println(" Please Enter No of Years");
		n = sc.nextDouble();
		System.out.println(" Please rate of intrest");
		r = sc.nextDouble();
		
		si = (p * r * n)/ 100;
		System.out.println("the SI is " + si + "\n");
		int age=65;
		 System.out.println(age>60 ? "You are old": "you are young");
	}
}
