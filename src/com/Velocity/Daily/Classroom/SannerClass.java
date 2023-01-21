package com.Velocity.Daily.Classroom;
import java.util.Scanner;
  
public class SannerClass {
	


	public static void main(String[] args) {
		
		// Use SCANNER CLASS when we need user to I/P the values and then execute
		
				System.out.println("Enter The Value=");     // to display for user to start flow
				
				Scanner sc=new Scanner(System.in);      // scanner requires calling an object
				
				// since scanner class is undefined here we need to  IMPORT  Scanner from  PACKAGE as  java.util.Scanner
				
				System.out.println("Enter first no.=");
				
				long d=sc.nextLong();     // nextLong   forms method it can be Int, Byte, any as required
				
				System.out.println("Enter Second no.=");
				
				long e=sc.nextLong();
				
				System.out.println("Result="+(d*e));
				
				System.out.println("Enter Your Name");
				
				 String name=sc.next(); 
				                  // next for same line...nextLine for seperate Line
				
				System.out.println(name+"=Your Name Confirmed");
				
				String na=sc.nextLine();                // next for same line...nextLine for seperate Line
				
				System.out.println(na+"= Confirmed");
				


			
//				int a=sc.nextInt()
//						
//						byte a=sc.nextByte();
//				
//				long a=sc.nextByte(radix)
//						
//						string a=sc.nextLine
//				
				
	}

}
