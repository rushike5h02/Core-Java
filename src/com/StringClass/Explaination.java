package com.StringClass;

//String..... is the class that represents sequence of character. 

//Package is... Java. Lang. 

//String class implements Serializable, comparable, char sequence interface.

//String is the immutable, once string object is created, it cannot changed but new string object is created.
//For mutable class, you can use String buffer and String builder class

//Java String class provides a lot of methods to perform operations on strings 
//such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.

//How to create the string object?

// 1.	.....String literal-.........one object,one memory location, multiple reference(if any)

//It is created by using double quotes......stores in String Constant Pool

//Example- String s=” velocity”;

//Each time when you create string literal, the JVM check string constant pool first, . 
//if the string object is already present in the pool, reference to pooled instance is returned
//If string does not present in the pool, new string instance is created and placed in pool


//..2..........By "new" Keyword-........one memory location, Two Object, Two References

// Stores in Heap Area, but creates object in both String Constant Pool and Heap Area...and reference to both location

//Example- String s= new String(“pune”);
//* create two objects 

//In such case, JVM will create the new String object in normal(non-pool) heap memory 
// and literal “pune” will be placed in string constant pool. The variable s refer to object in heap(non-pool)




public class Explaination {
	
public static void main(String[] args) {
		
	String s= "Rushikesh";
	
	s.concat("Bhand");   // concat...method used to join/append two strings ....
	
	// but String is immutable...i.e...once created can not change its form
	// thus answer will not be join of two strings
	
	System.out.println(s);

}
}
