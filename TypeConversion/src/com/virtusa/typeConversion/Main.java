package com.virtusa.typeConversion;

public class Main {
	public static void main(String args[]) {
		/* Implicit conversion 
		int i = 100;
        long l = i;  
          
        float f = l;  
        
        System.out.println("Int value "+i); 
        System.out.println("Long value "+l); 
        System.out.println("Float value "+f); 
        */
//		  byte b;  
//	        int i = 257;  
//	        double d = 323.142; 
//	        System.out.println("Conversion of int to byte.");  
//	          
//	        //i%256 
//	        b = (byte) i;  
//	        System.out.println("i = " + i + " b = " + b); 
//	        System.out.println("\nConversion of double to byte."); 
//	          
//	        //d%256 
//	        b = (byte) d;  
//	        System.out.println("d = " + d + " b= " + b); 
		  	byte b = 42; 
		  	System.out.println("b = " + b); 
	        char c = 'a'; 
	        System.out.println("c = " + c); 
	        short s = 1024; 
	        System.out.println("s = " + s); 
	        int i = 50000; 
	        System.out.println("i = " + i); 
	        float f = 5.67f;
	        System.out.println("f = " + f); 
	        double d = .1234; 
	        System.out.println("d = " + d); 
	        // The Expression 
	        int result = (int) ((f * b) + (i / c) - (d * s));
	        
	        double result1 = (f * b) + (i / c) - (d * s);
	          
	        //Result with type conversion  
	        System.out.println("Result with type conversion with int variables = " + result); 
	        
	      //Result after all the promotions are done 
	        System.out.println("Result with conversion with double variable= " + result1); 
	}
}
