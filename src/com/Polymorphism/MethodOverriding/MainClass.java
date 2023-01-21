package com.Polymorphism.MethodOverriding;

public class MainClass {

	public static void main(String[] args) {
		
		
		// we need main method to call the overridding method 
		
		     // by object creation
		
		
		System.out.println("..........with use of method Overriding..........");
		
		// by using method overriding
		
		ChildClass childObj= new ChildClass();
           
		childObj.m1();            // though m1 is common in parent and child 
		                            //  by object creation of child it overrides the parent method
		
		childObj.m2();
		
		
		
		
		// with-out  use of method Overriding
		
		System.out.println("............with-out  use of method Overriding............");
		
		ParentClass parentObj = new ParentClass();
		
		parentObj.m1();
		
		ParentClass pobj = new ChildClass();   // dynamic dispatch
		
		pobj.m1();
		
		
		
	}

}	
