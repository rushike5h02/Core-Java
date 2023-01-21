package com.Velocity.Daily.Classroom;

public class AccessSpecifiers {


	// default Access Specifier.....within package
	
 void defaultAS() {
	 int a=10, b=20;
	 System.out.println("Default AS within package="+(a+b));            // can be accessed by object creation
 }
	
    // Private Access Specifier ........in same class only
 
 private void privateAS(){
	 int c=50, d=20;
		System.out.println("Private within class only="+(c-d));           // can be accessed by object creation
	}
	
    // Protected Access Specifier......in same package and in different be using inheritance
 
protected void protectedAS() {
	int p=30, q=40;
	System.out.println("Protected in same package and different package be inheritance="+(p*q));        // can be accessed by object creation
}
 
   // Public Access Specifier........in same or different class and package also

public void publicAS() {
	int x=240, y=12;
	System.out.println("Public AS anywhere="+(x/y));                // can be accessed by object creation
}

 
	public static void main(String[] args) {
		
// we need method calling to print method...as things inside main method are printed as output
		
		AccessSpecifiers das= new AccessSpecifiers();        // for default  
		das.defaultAS();
		
		AccessSpecifiers pas=new AccessSpecifiers();        // for private
		pas.privateAS();

		AccessSpecifiers proas=new AccessSpecifiers();       // for protected
		proas.protectedAS();
		
		AccessSpecifiers pubas=new AccessSpecifiers();       // for public
		pubas.publicAS();
	}

}
