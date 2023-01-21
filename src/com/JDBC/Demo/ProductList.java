package com.JDBC.Demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductList {

	public ProductList getProductDetails() {
		ProductList prolist = new ProductList();
		
		
		try {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter The Product ID = ");
			int proid = sc.nextInt();
			System.out.println("Enter The Product Name = ");
			String uname = sc.next();
			System.out.println("Enter The Description  = ");
			String desc= sc.next();
			System.out.println("Enter The Product Price  = ");
			int price = sc.nextInt();
			System.out.println("Enter The Product Quantity  = ");
			int qty = sc.nextInt();
			
			
				Class.forName("com.mysql.jdbc.Driver");
					
				// step...2.....Establish connection
					
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/E_Commerce", "root", "root");
				
				// step ...3... create statement
				
				PreparedStatement psmt = con.prepareStatement("insert into productlist (productID,name,description,price,quantity) values (?,?,?,?,?)");
				
				
					
				// step ...4.... prepare sql statement
				psmt.setInt(1, proid);
				psmt.setString(2, uname);
				psmt.setString(3, desc);
				psmt.setInt(4, price);
				psmt.setInt(5, qty);
				
				// step ...5.....submit sql statement
				
				int i = psmt.executeUpdate();
				
				// step...6.... process result
				
				System.out.println("Insertion Succesfull" + i);
				
				con.close();
					psmt.close();
					sc.close();
					
		} catch (Exception e) {
					System.out.println(e);

				}	
	
		return prolist;
	}
	
	public static void main(String[] args) {
		
		ProductList pro = new ProductList();
		for(int i = 1; i<=10; i++) {
		pro.getProductDetails();
		}
	}

}
