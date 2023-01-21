package com.Velocity.Daily.Classroom;
 
public class NonStatic{

	// method created so can be called in any method for operation without rewriting every time
	
	protected void methodOne() {  // non-static means require object
		System.out.println("Print method1");
	}
	
	// main method as entry point of execution
	
	public static void main(String[] args) {   // its has static since being main method 
		// then we need to create object to call method1
		
		NonStatic method=new NonStatic();
		
		//we call method1 as objectName.methodName();
		
		method.methodOne();
		
		
	}
}
