package com.ObjectClass;

// Object Class is Parent Class of all Class in JAVA

// but there is no need to write...Example extends Object......it is invisibly present

public class Example {
	
	int empid;
	String empName;

	public static void main(String[] args) {
		
		// There are various Method in Object Class they are
	
		
	//...1..getClass()... method...used to get Meta Data..i.e.. information about data
		
	    // it give all details about package, class, methods,...i.e, 
		
	Example example1= new Example();
	    Example example6= new Example();
    System.out.println(example1.getClass());   // it will give Output= Class name, package address
           System.out.println(example6.getClass().getName());
	
	
	// .....2....hashCode()...method....it give the Unique code used by JVM for object
	
	System.out.println(example1.hashCode());   // output== Unique Code used by JVM for Class Example
	       //System.out.println(example6.hashCode());
	
	
	// ...3... equals()....method......it compares two object and give as..boolean..i.e   True or False
	
	Example example2= new Example();
	
	example2.empid=1;
	example2.empName="Rushi";       // Assigning value to global variable in Object
	
	Example example3= new Example();
	
	example3.empid=1;
	example3.empName="Rushi";
	
	System.out.println(example2.equals(example3));          // it Compares 2 object as True or False
	  //System.out.println(example2.hashCode());
	   //System.out.println(example3.hashCode());
	
	
	//....4...toString()...method....it print all the Data Members of Object properly
	
	
	Example example4= new Example();
	
	example4.empid=1;
	example4.empName="Mahadev";
	
	System.out.println(example4.toString());     // to call toString
	}
	
	// we can call..toString()...by using right click + Source...generate toString()....for variables we need
	// by Selecting field/ method  for toString()
	// it creates new method  toString()
	
	@Override
	public String toString() {
		return "Example [empid=" + empid + ", empName=" + empName + "]";
	}

	
	// ...5....notify()
	
	//....6....notifyAll()
	                                // these are all Methods in Object Class....we will study them in Multithreading
	//....7....wait()
	
	//....8....wait(long , int)
	
	//....9....finalize()

	
	

}
