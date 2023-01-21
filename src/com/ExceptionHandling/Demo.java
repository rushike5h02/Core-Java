package com.ExceptionHandling;

//...Exception Handling.....

//An ...exception... is an event, which occurs during the execution of a program, 
     //that disrupts the normal flow of the program's instructions


//...."Exception Handling"... in Java is one of the effective means to handle the runtime errors 
     //so that the regular flow of the application can be preserved.


public class Demo {

	public static void main(String[] args) {
		
//		System.out.println("First line");
//		System.out.println("Second line");
//		int a = 10 / 0;
//		System.out.println("Third line");
		
		// output.....
		//  First line
		//  Second line
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
	     //	at com.velocity.ExceptionDemo.main(ExceptionDemo.java:10)

// to avoid printing of error and continue flow even after error ..we use...exception handling...
		
//....1...using......"try and catch".....Block
		
		System.out.println("First line");
		System.out.println("Second line");
		try {
			int a = 10 / 0;
		
		}catch(Exception e) {           // Exception....built-in class....and stores value in...object.."e"...
			System.out.println(e);
		}
		
		System.out.println("Third line");

	}
}
		
		// Output.....will continue flow even with error and give type of Exception	
            //	First line
		    //    Second line
		     //   java.lang.ArithmeticException: / by zero........gives type of Exception
	        //	Third line	


