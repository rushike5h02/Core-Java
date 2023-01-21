package com.ConstructorChaining;

//....1...Constructor Chaining in Same Class......using .."this".....keyword


public class SameClass {
	
	SameClass(){        // no-argument constructor
		this(5);      //.....this..5.. defines no. of time it will execute.....else it will go into recursion
		System.out.println("No-Argumented Constructor");
	}
	
	SameClass(int x){
	this("Java");                        // gives String argument
		System.out.println(x);
	}

	SameClass(String str){                   // string Constructor
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		
		SameClass sc=new SameClass();               // no arguments
		
		
	}

}

// output.....Java..5...No-Argument Constructor


// flow......constructor no.1--->no.2---->no.3

// but........ no.3----.....-->no.2--------->no.1
         // will call      // will call
      //and print  Java      // then int x=5