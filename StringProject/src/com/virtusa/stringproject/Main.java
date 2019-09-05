package com.virtusa.stringproject;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		
		String message = "Hello ";
		String message1 = "World";
		System.out.println(message.concat(message1)); //concat() method
		System.out.println(message.length()); //getting length of the message variables 
		sc = new Scanner(System.in);
		System.out.println("Please enter your name below \t");
		String message3 = sc.next();
		System.out.println(message.concat(message3));
		System.out.println(message3.charAt(0));
		
	}

}
