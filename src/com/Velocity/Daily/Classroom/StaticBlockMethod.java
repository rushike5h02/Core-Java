package com.Velocity.Daily.Classroom;

public class StaticBlockMethod {
	
	// Static Block
	
			static {
				System.out.println("The Static Block");
			}
			
			// Static method
			
			static void m1() { 
				System.out.println("The Static Method");
			}
			
			public static void main(String[] args) {

				System.out.println("The Main Method");
				
				StaticBlockMethod.m1();
			
		}

}
