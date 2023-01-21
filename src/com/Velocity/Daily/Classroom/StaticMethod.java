package com.Velocity.Daily.Classroom;

public class StaticMethod {

	// create method that can be called anywhere, multipletimes...without object
	// create static method
	
	public static void methodOne() {
		System.out.println("Print M1");
	}
	
	// Similarly many method can be taken
	
	public static void methodTwo() {
		System.out.println("Print M2");
	}
	
	public static void methodThree() {
		System.out.println("Print M3");
	}
	
	// we need main method for entry point
	
	public static void main(String[] args) {
		
		// static method can be called without object creation
		//  way--1
		
	StaticMethod.methodOne();
	
	//  way...2
	
	methodTwo();
	
	// way....3....can be by object creation but unnecessay, unwarranted
	
	StaticMethod method=new StaticMethod();
	method.methodThree();
	
	// answwer written as per no. of calling
	}
}
