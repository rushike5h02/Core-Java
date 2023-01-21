package com.StringClass;

import java.util.Scanner;

public class StringPractice {
	
//...method to return the name
	private static String getStudentName(String name) {
		return name;
	}


	public static void main(String[] args) {

// display velocity message on screen
		String str = "velocity";
		System.out.println("String Value="+str);
	
// to perform the string operation
		
		System.out.println(str.length());    // gives length of String
		System.out.println(str.charAt(4));   // locate character at location.......index start from "o"...i.e...0,1,2,3,4,..etc
		System.out.println(str.compareTo("velocity"));     
		System.out.println(str.concat("pune"));      // will not give result...as string is immutable
		System.out.println(str.hashCode());      
		System.out.println(str.toLowerCase());      // convert Upper case to lower Case
		System.out.println(str.toUpperCase());      // converts Lower case to Upeer case
		
	
//.......method to return the name		
		
		System.out.println("Enter your name>>");
		Scanner scanner= new Scanner(System.in);
		String name=scanner.next();
		String s= getStudentName(name);
		System.out.println(s);

	

		
		
	}	
}
