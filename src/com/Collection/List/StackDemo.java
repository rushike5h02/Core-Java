package com.Collection.List;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

// Insertion is verticle but from down side,  removal from Upside......Fist-in-Last-Out...design

// Instertion order Preserved,....duplicates Allowed....Heterogeneous allowed,,,,,null Allowed
		
		Stack s = new Stack();
		
		s.push("A");
		s.push("C");
		s.push("B");
		s.push("C");
		s.push(10);
		s.push(null);
		
		System.out.println(s);
	
		System.out.println(s.search("X"));      // if element not found then return -1
		
		
		for(int i=0; i<s.size(); i++) {
			
			System.out.println(s.pop());
		}
		
		s.peek();
		System.out.println(s);
		
		
		
		
	}

}
