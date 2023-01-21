package com.Keyword.Super;

// Super Keyword is used to represent immediate Parent..Class..method..object...constructors

// used by "super.parent Class/method/object/constructor Name"

public class Child extends Parent{           // use inheritance

	String color="Brown";
	
	void displaycolor() {
		System.out.println("Child Color"+color);
		
// for Parent		
		System.out.println("Parent color ==="+super.color);
	
// for method insted of inheritance we can us eonly  "super "	keyword		
		
		super.eat();
	}
	
	
	
	
	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.displaycolor();
		
		// or regular use
		
		child.eat();
		

	}

}
