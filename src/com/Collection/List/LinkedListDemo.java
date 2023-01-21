package com.Collection.List;

import java.util.LinkedList;

import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
// insertion order not preserved, ...duplicates Allowed,.......Null allowed	.....Heterogeneous allowed	
		
		LinkedList al = new LinkedList();
		al.add(50);
		al.add("Jeevan");
		al.add(10);
		al.add(null);
		al.addFirst("Pune");
		al.add(2, "Software");
		
		System.out.println(al);

// Using Genertic		
		
		LinkedList<Integer> linkedList= new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(40);
		linkedList.add(30);
// 		linkedList.add("R");     // will give ClassCastException		
		
		linkedList.add(20);      
		linkedList.add(20);
		linkedList.addFirst(70);
		linkedList.addLast(80);
		
		System.out.println(linkedList);
		
		int a=linkedList.get(3);
		System.out.println("4th index is="+a);
		
		System.out.println("first way="+linkedList);

//  to traverse		
		
		Iterator<Integer> itr= linkedList.iterator();
		while(itr.hasNext()) { 
			System.out.println(""+itr.next());
		}
		
		for(Integer t : linkedList) {
			System.out.println("using for each loop="+t);
		}

	}

}
