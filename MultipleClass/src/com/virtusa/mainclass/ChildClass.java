package com.virtusa.mainclass;

public class ChildClass {
	
	public void displayMessage(String name, int Id) {
		
		if (Id % 2 == 0) {
			System.out.println(" hello " + name + " : )" +  " your Id is " + Id);
		} else {
			System.out.println(" Something went wrong.........");
		}
	}
}
