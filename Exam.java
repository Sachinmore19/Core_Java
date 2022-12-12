package com.velocity.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam extends MainLogic {
	
	
	

	public void goExam() throws SQLException {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the name of Student:  ");
		
		String name=scanner.nextLine();
        System.out.println("Enter the mail id :  ");
		
		String email=scanner.nextLine();
		System.out.println("Welcome "+name+" to Quiz game.");
		
		super.logic();
		
		
		
		
		int Right=super.correctAnscount ;
		int Wrong=10-Right;
		
		Connection con = null;
		PreparedStatement preparedStatement = null;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Sachin@123");
			preparedStatement = con.prepareStatement("insert into result (Student_Name,email_id,Right_Answer,Wrong_Answer,Marks,Gread)values(?,?,?,?,?,?)");
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.setInt(3, Right);
			preparedStatement.setInt(4, Wrong);
			preparedStatement.setInt(5, Right);

			if (Right >= 8 && Right <= 10) {
				preparedStatement.setString(6, "Class A");
				preparedStatement.executeUpdate();

			} else if (Right >= 6 && Right <= 7) {
				preparedStatement.setString(6, "Class B");
				preparedStatement.executeUpdate();
			} else if (Right == 5) {
				preparedStatement.setString(6, "Class C");
				preparedStatement.executeUpdate();
			} else {
				preparedStatement.setString(6, "Fail");
				preparedStatement.executeUpdate();
			}

			
			correctAnscount=0;
			wrongAnswercount=0;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			preparedStatement.close();
		}

	}

	
	
}
