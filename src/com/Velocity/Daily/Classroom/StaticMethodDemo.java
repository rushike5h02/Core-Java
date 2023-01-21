package com.Velocity.Daily.Classroom;

public class StaticMethodDemo {
	
	public static void m1() {
		System.out.println("Static method");
		
	}
	public static void m2() {
		System.out.println("Static method 2");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticMethodDemo.m1();   // way 1
m1();    // way 2
// 3rd way start 
StaticMethodDemo demo=new StaticMethodDemo();
demo.m1(); // giving messagge as its for NON-Static method is unnecessary but can be used 

// 3rd way finish

// to call method m2 by 2 ways
StaticMethodDemo.m2();

m2();
	}

}