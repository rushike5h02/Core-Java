package com.Velocity.Daily.Classroom.OOPs.Inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		// Parent---->Child Class
		// Super---->Sub 
		// Base---> Derived
		// Old-----> New
		
		      // Parent and 2 Child Class
		
				ParentClass childTwo=new ChildTwo();        // Hierarchical Inheritance   
				
				System.out.println(childTwo.a);
			    System.out.println(childTwo.b);  
				
				childTwo.m1();
				childTwo.m2();
				
		
		// Scenario-1... object creation for Parent class
		
		ParentClass parentClass= new ParentClass();          
		
		System.out.println(parentClass.a);
		System.out.println(parentClass.b); 
		
		parentClass.m1();
		parentClass.m2();
		
		// Scenario-2.....object creation for Child Class
		
		ChildClass childClass=new ChildClass();
		
		System.out.println(childClass.a);
		System.out.println(childClass.b);
		System.out.println(childClass.c);
		
		childClass.m1();
		childClass.m2();
		childClass.m3();
		
		// Scenario-3....object creation by Dynamic Dispatch....i.e..for Child by reference to Parent
		
     	ParentClass childDispatch=new ChildClass();             // Hierarchical Inheritance
		
		System.out.println(childDispatch.a);
		System.out.println(childDispatch.b);
		//System.out.println(childDispatch.c);
		
		childDispatch.m1();
		childDispatch.m2();
		//childDispatch.m3();
		
		// Scenario-4.....3 and 4 are similar
		
		ParentClass  parent4= new ParentClass();
		
		ChildClass child4=new ChildClass();
		
		parent4=child4;
		
		// while calling Parent Class
		
		System.out.println(parent4.a);             
		System.out.println(parent4.b);
		//System.out.println(parent4.c);
		
		parent4.m1();
		parent4.m2();
		//parent4.m3();
		 
		
		// while calling Child Class
		
		System.out.println(child4.a);
		System.out.println(child4.b);
		System.out.println(child4.c);
		
		child4.m1();
		child4.m2();
		child4.m3();
		
		
		// Scenario-5.......Similar to scenario-2 calling Child Class
		
        ParentClass  parent5= new ChildClass();
		
		ChildClass child5=new ChildClass();
		
		child5=(ChildClass) parent5;      // object for Child Class extended to object for parent
		
		System.out.println(child5.a);
		System.out.println(child5.b);
		System.out.println(child5.c);
		
		child5.m1();
		child5.m2();
		child5.m3();
		
		
		// Scenario-6......Possibility is Invalid
		
		//ChildClass Child6=new ParentClass();     ......It is Invalid
		
		
	

		

	}

}
