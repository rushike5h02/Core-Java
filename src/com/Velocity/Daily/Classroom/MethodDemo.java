package com.Velocity.Daily.Classroom;
 
public class MethodDemo {

	
	
	// we are printing whats inside  m1 method
	
	public static void main(String[]args){    //  it is still entry pint
		
		
			MethodDemo methodDemo=new MethodDemo();
		// calling m1 method.......object name.methodName();
			methodDemo.m1();
	}
			public void m1(){  //  non static method
				int a=10;
				
				System.out.println("Print="+a);
				System.out.println("We in m1");
				
		}
	}

