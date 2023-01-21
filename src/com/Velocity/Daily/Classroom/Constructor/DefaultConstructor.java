package com.Velocity.Daily.Classroom.Constructor;

public class DefaultConstructor {
        
	String city;                        // initialization
	
// Constructors are methods with same name as Class name  
	//.......do not have return type
	
	// default.... when theres no access specifier
	
	DefaultConstructor(){            // constructor without access specifier is taken DEFAULT by JAVA COMPILER
		city="Ahmednagar";
		System.out.println("Default Constructor=");
	}
	
	
	public static void main(String[] args) {
		
		DefaultConstructor defaultcon=new DefaultConstructor();         // to call constructor
		
		System.out.println(defaultcon.city);           
		

	}

}


