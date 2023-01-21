package com.javaDemo;

public class Demo {    //defined the class and class name

	Boolean one = false;
	
	byte a=10;   // global variable....variable initialisation	
short b=20;   // variable initialisation
int c; 
long l=30;// variable declaration
float f1=10.5f;          // only for float we have to define like this..to convert from double to float
double d=20.5;
char letterA='A';
public static void main (String[] args) { //define main method it became main class..entry to program
	System.out.println("Hello Demo");   // to print we used String and args in ("..")
	
	
	
	Demo demo = new Demo ();  // defines <Class><object> = <new>(keyword) <Class>();
    
	
	System.out.println("Value of Boolean="+demo.one);
	
	System.out.println("Value of a="+demo.a);    //+ for concation(to use two statement) operator
System.out.println("value of b");   // to only print b as local variable if declared
System.out.println("Value of c="+demo.c);   //to print global variable c
System.out.println("Value of l="+demo.l);
System.out.println("Value of f="+demo.f1);
System.out.println("Value of d="+demo.d);
System.out.println("Value of A="+demo.letterA);

}
}
