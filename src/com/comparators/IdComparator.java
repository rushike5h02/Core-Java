package com.comparators;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{

//	@Override
//	public int compare(Employee o1, Employee o2) {
//		
//		return o1.id.compareTo(o2.id);
	
	public int compare(Employee s1,Employee s2){  
		
		
		if(s1.id==s2.id)  
		return 0;  
		else if(s1.id > s2.id)  
		return 1;  
		else  
		return -1;  
		}  

}
