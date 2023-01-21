package com.ConstructorChaining;


//....2.....Constructor Chaining in Different Class......using ...."super"....keyword

// also called......"Chaining Inheritance"


public class Derived extends Base{                 // inherited base Class

	Derived(){                 
		System.out.println("No-Argumented Derived Constructor");
	}
	
	Derived(String str){        // parameterized
		super(str);     // to call parameters from Base Class
		
		System.out.println("Parameterized Derived Constructor");
	}
	
	public static void main(String[] args) {
		
		// to print the constructors only one kind of constructor can be called at a times by object creation
		
//...if we us No-Arguments.....it will call No-Argument constructors from both class only
		
		
		Derived noarg= new Derived();      // without Argument
		
		
		
		
//...if we us Argument.....it will call Parameterized constructors from both class only		
		
		
//		Derived par= new Derived("Parameter");
		
	}

}
