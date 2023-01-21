package com.Velocity.Daily.Classroom;

public class WrapperClass {
	// the package============java.lang.....
	
// process of converting Primitive data types into Object and Vice-Versa is ...Wrapping
	
//..Auto-Boxing...Converting Primitive data types into Objects
	//...Un-Boxing...converting Objects into Primitive Data Types
	
//there are 8 Classes in Wrapper	
	// Object     Data Types
	
	//Integer       int
	//Byte         byte
	//Short         short
	//Long          long
	//Float         float
	// Double        double
	//Boolean        boolean
	//Character       char

	public static void main(String[] args) {
		
int a=20;

// Auto-Boxing
Integer i= new Integer(a);      // calling Wrapper Class Integer==for==int
		
System.out.println("value of Object=="+a);

// Un-Boxing........it requires Auto-Boxing First

int b=i.intValue();        // explorer will give recomends

System.out.println("data type value=="+b);

char letter='c';
Character c= new Character(letter);
System.out.println(" auto boxed Character value=="+letter);
	
char lit= c.charValue();
System.out.println("unboxed value==="+lit);
	}

}
