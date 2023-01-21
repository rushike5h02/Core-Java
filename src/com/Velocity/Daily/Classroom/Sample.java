package com.Velocity.Daily.Classroom;
  
public class Sample {   // defined the class(Sample)( same as file name)

int a=10;
int b=20;
int c;

public static void main (String[] args) {   //  defined method i.e the """main method"""
	
Sample sample=new Sample ();    // object......1
	
System.out.println("Sampple Object");

System.out.println("Value of a="+sample.a);    // object name sample

System.out.println("Value of b=");    //.............................Body of method

System.out.println("Value of c="+sample.c);   // object name sample

System.out.println("Fourth Output="+sample.b);

Sample demo=new Sample ();   // object.............2

System.out.println("Value of demo in b="+demo.b);

Sample chart=new Sample ();   //  object.................3

System.out.println("Value of chart="+chart.c);


}
}