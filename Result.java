package com.velocity.exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Result {

	public void getResult() throws SQLException {

		Connection con = null;
		PreparedStatement ps = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Sachin@123");
			Scanner scanner =new Scanner(System.in);
			
			System.out.println("**********Welcome**********");
			System.out.println("Enter your email id  ");
			String email=scanner.nextLine();
			ps = con.prepareStatement("select * from result where email_id= '"+email+"' ");
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				System.out.println("Email ID      : " + rs.getString("email_id"));
				System.out.println("Student Name  : " + rs.getString("Student_Name"));
				System.out.println("Mark          : " + rs.getString("Marks"));
				System.out.println("Gread         : " + rs.getString("Gread"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
			ps.close();
		}
	}
}
