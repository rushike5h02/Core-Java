 package com.Abstraction.Interface;


    // we need IMPLEMENTED CLASS (Child)..to implement interface 

         // by using Interface in IMPLEMENTED WAY....using keyword.....implemented

public class Test implements Demo {                    // it will inherit Demo into Test

	    // it will give compile time error
	
		// by using cursor on Test we "add unimplemented methods"   to add Abstract Methods Automatically

		@Override
		public void m1() {
			System.out.println("Method m1");
			}

		@Override
		public void m2() {
			System.out.println("Method m2");
			}        
	
		// we require main method to call methods in Interface and Test Class 
		
		public static void main(String[] args) {
			
			// we can not create object for Abstract class... as it doesn't have any   body/implementation
			
			// so, we call method in ...Test (Implemented)...  class by object creation
			
			Test test =new Test();
			
			test.m1();       // it will take method body from Test (Implemented)  Class 
			test.m2();        // but print for Abstract Method in Interface
			
			
			
			
	// unlike Inheritance related to Class
			
			// Interface related to Method
			//  So, we Can use   MULTIPLE INHERITANCE for multiple Interface
			
// Example
			
		// Interface A  {   }
	 	
		// Interface B  {   }
			
		// Interface C extends A,B {   }
				
			
			
			
			
			
		}

}
