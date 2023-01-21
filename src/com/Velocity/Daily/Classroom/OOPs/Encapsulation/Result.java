package com.Velocity.Daily.Classroom.OOPs.Encapsulation;

public class Result {

	public static void main(String[] args) {
		
		Employee employee= new Employee();             // object declaration
		employee.setSalary(-65000);
		      //employee.setSalary(-40000);
		System.out.println("Employee Salary="+employee.getSalary());
		     //System.out.println("Employee Salary="+employee.getSalary());

		Student student=new Student();
		student.setFee(48000);
		
		
		System.out.println("Student fee="+student.getFee());
		
	}

}
