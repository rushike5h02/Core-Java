package com.StringClass;

public class StringDemo {
public static void main(java.lang.String[] args) {
	
//.....(==)..equals operator compares memory location

//....equals() method...compares content of method	
	
// Scenario ..1....
	
		String s1 = "velocity";             // String Literal
		String s2 = new String("velocity"); // By "new" Keyword
		System.out.println(s1 == s2);       // Compares memory location
		System.out.println(s1.equals(s2));   // compares content of string
		System.out.println(s1.hashCode());
    	System.out.println(s2.hashCode());
	
//..Scenario ..2....
		
//		String s1 = "velocity";
//		String s2 = new String("pune");
//		s2=s1;
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));

// Scenario 3.....		

//     	String s1 = new String("velocity");
//	    String s2 = new String("pune");
//    	s2 = s1;
//    	System.out.println(s1 == s2);
//    	System.out.println(s1.equals(s2));
//		System.out.println(s1.hashCode());
//   	    System.out.println(s2.hashCode());
//	
// Scenario. 4.....
//	 
//	    String s1 = "velocity";
//  	String s3 = new String("pune");
//  	String s4 = new String("pune");
//   	 String s2 = "velocity";
//  	System.out.println(s1 == s2);
//  	System.out.println(s1.equals(s2));
//  	System.out.println(s1.hashCode());
//  	System.out.println(s2.hashCode());
//  	System.out.println(s3.hashCode());
//  	System.out.println(s4.hashCode());

	
// Scenario..5.......
	
//    	String s1 = new String("velocity");
//	    String s2 = new String("velocity");
//    	System.out.println(s1 == s2);
//    	System.out.println(s1.equals(s2));
//    	System.out.println(s1.hashCode());
//   	    System.out.println(s2.hashCode());


}

}
