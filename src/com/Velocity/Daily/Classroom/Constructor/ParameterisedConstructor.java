package com.Velocity.Daily.Classroom.Constructor;
 
public class ParameterisedConstructor {
  
	String city;
	
	// Constructors are methods with same name as Class name 
		//.......do not have return type
	
	// Parameterized....when has Access Specifiers and both argument and parameters
	
    public ParameterisedConstructor(String city){           // constructor has Argument and Parameters
                                    // Parameters declared    	
    	
		city="Ahmednagar";
		System.out.println("Parameterised Constructor="+city);
	}
	
	
	public static void main(String[] args) {
		
		ParameterisedConstructor parametercon=new ParameterisedConstructor("Ahmednagar");   // to call constructor
		                                                                // Arguments are Declared 
		
		//System.out.println(parametercon.city);
		

	}
}
