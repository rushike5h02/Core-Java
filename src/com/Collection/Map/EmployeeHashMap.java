package com.Collection.Map;

import java.util.HashMap;

public class EmployeeHashMap {

	public static void main(String[] args) {
		
		HashMap<Employee, String> hashMap= new HashMap<Employee,String>();
		
		Employee employee= new Employee();
		
//employee as object in map as key and name as value
		
		hashMap.put(employee, employee.getId());
//		hashMap.put(employee, employee.getSalary());
//		hashMap.put(employee, employee.getName());
		
		
		System.out.println(hashMap.get(employee));

	}

}
