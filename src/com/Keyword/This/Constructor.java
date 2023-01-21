package com.Keyword.This;

//.......Constructor Chaining............calling parameterized from no-argument

public class Constructor {
		
	Constructor(){              // no argument constructor
			this(4);        // if value not given to ...this....it will go into...recursion...that is in infinite loop
			System.out.println("Hello");
		}
	Constructor(int x){                  // parameterzed constructor
			
			System.out.println(x);
		}
			
		public static void main(String[] args) {
			
		Constructor i = new Constructor();  
			
		// constructor do not require "object.methodname();"
		//i.x;	
			
			
		
		}
}


// output......5
//             Hello