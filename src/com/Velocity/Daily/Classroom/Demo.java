package com.Velocity.Daily.Classroom;

public class Demo {
	int b=30;
	int a=40;
	 

	public static void main (String[] args) {
		int a=10;
		int b=20;
		
		Demo chart=new Demo ();
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		Demo table=new Demo ();
		System.out.println("Value of a="+table.a);
		Demo chair=new Demo ();
		
System.out.println("Value of a="+chart.a);   // ""+a"" allow to access local variable a
System.out.println("Value of A="+chair.a);    // ""+<object>.a allow to access global variable a.....

//...that is..   +chart.a   ..access global variable  a  for object chart


	}
}
	