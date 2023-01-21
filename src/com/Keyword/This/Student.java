package com.Keyword.This;

//......This...is used to represent current class

//if data member is declared with ...this...keyword 

//it is called...this variable....this method.....it does not..this class..as it is restricted to same class

// this ...can be used for....constructor chaining


public class Student {
	
	int rollno;
	String name;
	
	// we generate constructor...by using right click+source+generate constructor for fields

	public Student(int rollno, String name) {
		super();                      // it calls constructor
		this.rollno = rollno;       // local variables
		this.name = name;
	}

	void display() {
		
		System.out.println(rollno+"---"+name);
	}


	public static void main(String[] args) {
		
		Student s1= new Student(1,"Rushikesh");
		
		Student s2 = new Student(2,"Bhand");
		
		s1.display();
		s2.display();
	}
		
		
	
	}
		
		

	
	


