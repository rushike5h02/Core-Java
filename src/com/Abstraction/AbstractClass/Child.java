package com.Abstraction.AbstractClass;

public class Child extends AbstractClass{           // for Abstraction we need to inherit Abstract Class

	     // it will give compile time error
	
		// by using cursor on Test we "add unimplemented methods"   to add Abstract Methods Automatically
	
	@Override
	void m1() {
		System.out.println("Method m1");
		}

	@Override
	void m2() {
		System.out.println("Method m2");
		}
	
	
	
	// we require main method to call methods 
	
	public static void main(String[] args) {
		
		// we can not create object for Abstract class... as it doesnt have any   body/implementation
		
		// so, we call method in child class by object creation
		
		
		Child child = new Child();
		
		child.m1();                 // it will take method body from Child Class but print for Abstract Method
		child.m2();

	}



}
