package com.comparators;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {          // declaring Objects to Compare
		
		return emp1.name.compareTo(emp2.name);          // to sort on basis of names
		
		
		// comparing names from ArrayList
		// comparing  2 Objects of Employee class from ArrayList (List)
	}

	
}
