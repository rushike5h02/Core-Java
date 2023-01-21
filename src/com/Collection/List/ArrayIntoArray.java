package com.Collection.List;

import java.util.ArrayList;

public class ArrayIntoArray {

	public static void main(String[] args) {
		
//...ArrayList into Itself....LinkedList...Vector...Stack....into itself
		
// ...Arraylist a1 = new Arraylist();
		//body

// ArrayList a2 = new ArrayList();
		
//		a1.addAll(a2);
		// S.O.P.(a1);
		
		ArrayList a1 = new ArrayList();
		
		a1.add(10); 
		a1.add("Rushikesh");
		a1.add(20);
		a1.add(20);
		a1.add(null);
		
		System.out.println("ArrayList is="+a1);
		
		ArrayList a2 = new ArrayList();
		
		a2.add(10);
		a2.add(40);
		a2.add(30);
		
		System.out.println("ArrayList is="+a2);
		
		a1.addAll(a2);
		
		System.out.println("ArrayList is="+a1);
		
	}
	

}
