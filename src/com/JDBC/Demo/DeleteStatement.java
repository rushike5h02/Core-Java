package com.JDBC.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//delete using prepared statement 
public class DeleteStatement {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver"); // load the establish

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			PreparedStatement ps = con.prepareStatement("delete from user where userid=?");

			ps.setInt(1, 104); //here 1 is the parameter index, 8 is the id of table
			
			int i = ps.executeUpdate();

			System.out.println("Record deleted." + i);

			con.close();
			ps.close();
		}

		catch (Exception e) {
			e.getMessage();
		}
	}
}
