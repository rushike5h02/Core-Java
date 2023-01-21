package com.Velocity.Daily.Classroom.OOPs.Inheritance;

public class DynamicDispatch {

	public static void main(String[] args) {
		
		ClassA classB=new ClassB();      // dynamic Dispatch
		
		System.out.println(classB.a);
		System.out.println(classB.b);
		//System.out.println(classB.c);
		
		classB.m1();
		//classB.m2();
		
		

	}

}
