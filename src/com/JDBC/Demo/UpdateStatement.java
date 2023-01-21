package com.JDBC.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//update using prepared statement 
public class UpdateStatement {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver"); // load the establish

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

//for single update value
//			PreparedStatement ps = con.prepareStatement("update employee set name=? where id=?");

// multiple update value
			PreparedStatement preparedStatement = con
					.prepareStatement("update user set name=?, city=? where userid=?");
			

			preparedStatement.setString(1, "mendelian"); 
			preparedStatement.setString(2, "Moscow"); 
			preparedStatement.setString(3, "104");

			int i = preparedStatement.executeUpdate();

			System.out.println("Record updated." + i);

			con.close();
			preparedStatement.close();
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}
