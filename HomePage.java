package com.velocity.exam;

import java.sql.SQLException;
import java.util.Scanner;

public class HomePage {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("Welcome to exam hub:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for the Exam   :");
		System.out.println("Enter 2 for see result :");
		System.out.println("Enter 3 For admin      :");
		
		System.out.println("Enter here :");
		int input=sc.nextInt();
		
		
		if (input==1) {
			Exam exam=new Exam();
			exam.goExam();
			
		}else if(input==2) {
			Result result=new Result();
			result.getResult();
			
		}else if(input==3) {
			AdminResult adminResult=new AdminResult();
			adminResult.getAdminResult();
			
		}else {
			System.out.println("Please select correct option");
		}
		
		
	}

}
