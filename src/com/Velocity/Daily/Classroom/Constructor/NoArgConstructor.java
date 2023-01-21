package com.Velocity.Daily.Classroom.Constructor;
 
public class NoArgConstructor {
	
    String city;
	
 // Constructors are methods with same name as Class name 
 	//.......do not have return type    
    
    // No-Argument.....when has Access Specifier but no argument 
    
   public NoArgConstructor(){          // constructor with no argument and Parameter are NO-ARGUMENT CONSTRUCTOR
		city="Ahmednagar";
		System.out.println("No-Argument Constructor=");
	}
	
	
	public static void main(String[] args) {
		
		NoArgConstructor noargcon=new NoArgConstructor();          // to call constructor, without parameter
		
		System.out.println(noargcon.city);
		

	}

}
