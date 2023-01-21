package com.Velocity.Daily.Classroom;

public class NonStaticOperator {
  
         // Arithmatic operator
	int x=10, y=20;
	public void Add() {
		System.out.println("Addition="+(x+y));
	}
	public void Sub() {
		System.out.println("Subtraction="+(x-y));
	}
	public void Multi() {
		System.out.println("Multiplication="+(x*y));
	}
	public void Div() {
		System.out.println("Division="+(x/y));
	}
	public void Mod() {
		System.out.println("Remainder="+(x%y));
	}
	
	// Logical Operator
	
	int a=10, b=20,c=30;
	
	public void LogicalAnd() {
		System.out.println(a<b && b>c);
	}
	public void LogicalOr() {
		System.out.println(a>b || b<c);
	}
	
	// Bitwise Operator
	public void BitwiseAnd() {
		System.out.println(a<b & b>c);
	}
	public void BitwiseOr() {
		System.out.println(a<b | b>c);
	}
	
	//Relational Operator

	public void Relation() {
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println(x==y);
		System.out.println(x!=y);
	}
	
	// Assignment Operator
	
	public void Assign() {
		System.out.println(x=10);
	}
	
	// Unary Operator
	public void Unary() {
		 int d=20;
     d++;
   d--;
d++;
   System.out.println("Value of d="+d);
	}
	
	public static void main(String[] args) {

		System.out.println("1. Arithmatic Operators");  // for aesthetics
		NonStaticOperator obj=new NonStaticOperator();
		
		// Calling Arithmatic method
		obj.Add();
		obj.Sub();
		obj.Multi();
		obj.Div();
		obj.Mod();
	System.out.println(".................................................................");  // for asthetics
	
	System.out.println("2. Logical Operators");   // For aesthetics
	
	// Calling Logical method
			obj.LogicalAnd();
			obj.LogicalOr();
			System.out.println(".................................................................");  // for asthetics
	
			System.out.println("3. Bitwise Operators");   // For aesthetics
			
			// Calling Bitwise Operators
			
			obj.BitwiseAnd();
			obj.BitwiseOr();
			System.out.println(".................................................................");  // for asthetics	
			
			System.out.println("4. Relation Operators");   // For aesthetics	
			
			// Calling RelationOperator
			obj.Relation();

			System.out.println(".................................................................");  // for asthetics
			
			System.out.println("5. Assignment Operators");   // For aesthetics
			
			// Asignment Operator
			
			obj.Assign();
			System.out.println(".................................................................");  // for asthetics
			
			System.out.println("6. Unary Operators");   // For aesthetics
			
			// Unary Operator
			
			obj.Unary();
			System.out.println(".................................................................");  // for asthetics
			
	}
}
