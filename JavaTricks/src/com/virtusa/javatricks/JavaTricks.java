package com.virtusa.javatricks;

public class JavaTricks {
	public static void main(String a[]) {
		if (System.out.printf("Hello world\n") == null) {
//			System.out.println("worked fine");
		}
		String s = "Hi";
		
		switch(s) {
		case "Hi":
			System.out.println("Hi");
			break;
		case "Hello":
			System.out.println("Hello");
			break;
			default :
				System.out.println("Not available in variables i");
		}
	}
}
