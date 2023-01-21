package com.Multithreading.Pracrice;

import java.util.ArrayList;

//	10. Program for how insert the elements into list for type string and integer and iterate
//* by using for each loop


public class ArrayListDemo5 {

	public static void main(String[] args) {
		
		ArrayList arrayList= new ArrayList();
		
		arrayList.add(50);
		arrayList.add(10);
		arrayList.add("ram");
		
		for(Object o: arrayList) {
			System.out.println(o);
		}
		
	}
}
