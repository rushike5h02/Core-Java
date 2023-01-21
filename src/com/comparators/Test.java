package com.comparators;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "ram", 9000));
		al.add(new Employee(102, "ashok", 3000));
		al.add(new Employee(103, "ajay", 8000));

		Collections.sort(al, new NameComparator());

		for (Employee emp : al) {
			System.out.println("id=" + emp.getId() + " name=" + emp.getName() + " salary=" + emp.getSalary());
		}

		System.out.println();
		Collections.sort(al, new IdComparator());

		for (Employee emp2 : al) {
			System.out.println("id=" + emp2.getId() + " name=" + emp2.getName() + " salary=" + emp2.getSalary());
		}
		System.out.println();
		Collections.sort(al, new SalaryComparator());

		for (Employee emp3 : al) {
			System.out.println("id=" + emp3.getId() + " name=" + emp3.getName() + " salary=" + emp3.getSalary());
		}
	}


}
