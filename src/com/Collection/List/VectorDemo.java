 package com.Collection.List;

import java.util.Vector;

import java.util.Iterator;

public class VectorDemo {

	public static void main(String[] args) {
		
// Instertion order Preserved,....duplicates Allowed....Heterogeneous allowed,,,,,null Allowed	
		
		Vector v = new Vector();
		
		v.add(10);
		v.add(30);
		v.add("Ahmednagar");
		v.add(30);
		v.addElement("Pune");
		System.out.println(v);
		
		System.out.println(v.capacity());
		
		v.remove("Ahmednagar");               // to remove Element Known......to remove Element after checking ..contains()..below
		System.out.println(v);
		
		System.out.println(v.capacity());
		
// can add element using
		
		for (int i = 1; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("J");
		System.out.println(v.capacity());
		System.out.println(v);

// using Generic		
		
		Vector<String> vector= new Vector<String>();
		vector.add("Jeevan");
		vector.add("velocity");
		vector.add("Pune");
//		vector.add(10);               // will give....ClassCastException
		vector.add("Pune");
		System.out.println("new vector is="+vector);

// to traverse	
		
		for (String s : vector) {
			System.out.println(s);
		}
		
		
		
// To remove Element ....after checking contains()..method	
		while(vector.contains("Pune")) {
			vector.remove("Pune");
		}
		
		
		System.out.println("new vector is="+vector);
		
		System.out.println("vector size="+vector.size());
		System.out.println("vector capacity="+vector.capacity());
		System.out.println("index="+vector.get(1));

	}

}
 