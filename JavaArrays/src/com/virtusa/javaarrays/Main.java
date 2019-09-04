package com.virtusa.javaarrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = new int[10];
//		Random dice = new Random();
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = 1 + dice.nextInt(9);
//			System.out.println(arr[i]);
//		}
//		System.out.println(Arrays.toString(arr));
		//create a array tables
		
		int number[] = {1,2,3,4,5};
		int total = 0;
////		for (int counter = 0; counter < number.length; counter++) {
////			System.out.println(counter + "\t" + number[counter]);
////			total += number[counter];
////		}
////		System.out.println(total);
		for (int x: number) {
			total += x;
			System.out.println(x );
		}
		System.out.println(total);
		
		int newArrs[][] = {{1,2,3}, {4,5,6}};
		System.out.println(newArrs[1][0]);
		
		int a[] = new int[5];
		
		int y;
		
		Scanner sc = new Scanner(System.in);
		
		for ( y = 0; y < 5; y++) {
			System.out.println("Please enter the index value " +y);
			a[y] = sc.nextInt();
		}
		for (y = 0; y < 5; y++) {
			System.out.println(a[y] + " printed val of an array");
		}
	}

}
