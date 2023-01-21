package com.ConstructorChaining;

//....2.....Constructor Chaining in Different Class......using ...."super"....keyword

//also called......"Chaining Inheritance"


public class Base {

	String name;
	
	Base(){                  // No- Argument constructor
		this(" ");                  // to not let into...recursion......since we are using ...String...Argument
		System.out.println("No-Argument Base Constructor");
	}
	
	Base(String name){          // Parameterized Constructor
		this.name=name;      // this.golbal variable=local variable;         
		
		System.out.println("Parameterized Base Constructor");
		
	}
		
}


// Since it requires inheritance we need derived class to call these Constructors