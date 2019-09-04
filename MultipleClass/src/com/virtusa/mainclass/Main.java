package com.virtusa.mainclass;
import java.util.Scanner;

/* display input from as per user input */

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		
		String name = sc.next();
		int Id = sc.nextInt();
		
		ChildClass childObj = new ChildClass();
		
		childObj.displayMessage(name, Id);
		
		//method call
		privateclass();
	}
	public static void privateclass() {
		int a = 10;
		int b = 20;
		System.out.println(" Hello from private class ");
		System.out.println( a + b);
	}
}
