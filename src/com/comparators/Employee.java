package com.comparators;

// uses.. two methods.....public int compare(Object obj1, Object obj2)......cumpulsory
                      //  public Boolean equals()........Optional..invisibly present as method of Object Class
// used for Custom Sorting

// Custom Sorting in Comparator Class........requires New Class....Comparator..class

public class Employee {
	
	int id ;
	String name ;
	int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}	



}
