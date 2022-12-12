package com.velocity.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AdminResult {

	public void getAdminResult() {
		

		Connection con = null;
		PreparedStatement ps = null;
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Sachin@123");
			
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter user name:  ");
			String user =scanner.nextLine();
			System.out.println("Enter Password:  ");
			String pass =scanner.nextLine();
			ps = con.prepareStatement("select * from admin where username='"+user+"' and password='"+pass+"' ");
			
			ResultSet rs1 = ps.executeQuery();
			
			if (rs1.next()) {
				System.out.println("**********Welcome**********");
				
				ps = con.prepareStatement("select * from result ");
				
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println("ID            : " + rs.getString("id"));
					System.out.println("Email ID      : " + rs.getString("email_id"));
					System.out.println("Student Name  : " + rs.getString("Student_Name"));
					System.out.println("Mark          : " + rs.getString("Marks"));
					System.out.println("Grade         : " + rs.getString("Gread"));
					System.out.println("-----------------------t----------------------------");
					
				}
				
			}else {
				System.out.println("Wrong username or password");
				System.out.println("enter the correct username and password to fetch the result");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thank you visiting !!!");
	}
}
