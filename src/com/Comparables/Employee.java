package com.Comparables;


// uses only......public int compareTo(Object Obj)...method.......used for Custom Sorting
// ...ex...obj1.compareTo(obj2)
//..........if obj1>obj2====   1
//.............obj1<obj2====  -1
//.............obj1=obj2====   0

public class Employee implements Comparable<Employee> {          // sorting Done in Employee Class

	int id;
	String name;
	int salary;         // if we want to sort using it as custom objects for Sorting

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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

	// sort data by using salary, 
	@Override
	public int compareTo(Employee employee) {        // to store value into Object...employee
		//equal must return 0, > return 1, < return -1
		if (id == employee.id)
			return 0; 
		else if (id > employee.id)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



}
