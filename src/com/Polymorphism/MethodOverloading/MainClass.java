package com.Polymorphism.MethodOverloading;

public class MainClass {

	public static void main(String[] args) {
		
		
		// we need main method to call the methods
		
		MethodClass methodobj= new MethodClass();            // object creation for class in which we have methods
		
		// we call each method individually
		
		methodobj.m1(10,20);                     // Parameters of method
		methodobj.m2(10.0, 20.0);                 // Parameters of method
		methodobj.m3(10, 20, 30);                 // Parameters of method
		methodobj.m4(50);                        // Parameters of method 
		

	}

}
