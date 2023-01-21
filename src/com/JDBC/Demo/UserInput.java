package com.JDBC.Demo;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.Scanner;
	
public class UserInput {

		Connection connection = null;
		PreparedStatement ps = null;
	
	private void insertStudentData(String name, String city,int mobile) throws SQLException {
	

try {
	ConnectionTest connectionTest = new ConnectionTest();
	
	connection =connectionTest.getConnectionDetails();
	ps = connection.prepareStatement("insert into student(name,city,mobile)values(?,?,?)");
	
	ps.setString(1, name);
	ps.setString(2, city);
	ps.setInt(3, mobile);
	
	int i = ps.executeUpdate();
	System.out.println("Record is inserted successfully.." + i);
	
} catch (Exception e) {
e.printStackTrace();
} finally {
	
	connection.close();
	ps.close();
	}
	}
	
	public static void main(String[] args) throws SQLException {
	
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i < 3; i++) {
			System.out.println("Enter name>>");
			String name = sc.next();
			System.out.println("Enter city>>");
			String city = sc.next();
			System.out.println("Enter mobile>>");
			int mobile = sc.nextInt();
			UserInput userInput = new UserInput();
			userInput.insertStudentData(name, city, mobile);
}
	sc.close();
}

	
}
