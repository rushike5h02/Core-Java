package com.Velocity.Daily.Classroom.OOPs.Encapsulation;

public class Employee {
	
	private int salary;             // right click + source===generate getter and setter method

	// getter
	public int getSalary() {
		return salary;
	}

	// setter
	public void setSalary(int Esalary) {
		if(Esalary<0) {
			salary=0;
		}else {
			salary=Esalary;
		}
	
	}


}
