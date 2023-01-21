package com.JDBC.Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertEmployee {

	// using the......prepared statement
	
	public static void main(String[] args) {
		
		// step....1... Load driver
		
try {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter The UserName = ");
	String uname = sc.next();
	System.out.println("Enter The Password = ");
	int pass= sc.nextInt();
	
	
		Class.forName("com.mysql.jdbc.Driver");
			
		// step...2.....Establish connection
			
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDemo", "root", "root");
		
		// step ...3... create statement
		
		PreparedStatement psmt = con.prepareStatement("insert into employee (username, password) values (?,?)");
		
		// used Auto Increament for emp id                           (  ?   ,        ?       )
		// we need settter method to set values for (?,?)..that is...(index ,  value at index) 
			
		// step ...4.... prepare sql statement
		
		psmt.setString(1, uname);
		psmt.setInt(2, pass);
		
		// step ...5.....submit sql statement
		
		psmt.executeUpdate();
		
		// step...6.... process result
		
		System.out.println("Insertion Succesfull");
		
		//  can also use........
//		int i = psmt.executeUpdate();
//		System.out.println("Insertion succesful" + i);
		
			con.close();
			psmt.close();
			sc.close();
			
} catch (Exception e) {
			System.out.println(e);

		}
		
		

	}

}
