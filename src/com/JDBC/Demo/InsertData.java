package com.JDBC.Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	// using.....statement
	
	public static void main(String[] args) {
		
		// use try and catch block for database
		
try {
	
	
		
		// Step...1...to load the driver
		
		Class.forName("com.mysql.jdbc.Driver");
		
		// step...2.... to establish connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDemo", "root", "root");
		
		// step...3... create statement
		
		Statement smt = con.createStatement();
		
		// step...4...prepare statement
		
		String str = "insert into user(id, lname,fname ,email)values(1,'Rushikesh', 'Bhand', 'rushikeshbhand@gmail.com')";
			
 	    // step...5....submit sql statement to database
			
		smt.execute(str);        // or we can create statement inside execute(..);
		
		// step...6...process the result......to know added to database
		
		System.out.println("Insertion Succesful");
		
		con.close();
		smt.close();
		
	
}catch (Exception e) {
	System.out.println(e);
}

	}

}
