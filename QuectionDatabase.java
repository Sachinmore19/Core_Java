package com.velocity.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QuectionDatabase {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement preparedStatement = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Sachin@123");
			// Quection 1
			preparedStatement = con.prepareStatement(
					"insert into quections(Quection,Option1,Option2,Option3,Option4,Answer)values(?,?,?,?,?,?)");
			preparedStatement.setString(1,
					"Quection : Which component is used to compile, debug and execute the java programs?");
			preparedStatement.setString(2, "A. JRE");
			preparedStatement.setString(3, "B. JIT");
			preparedStatement.setString(4, "C. JDK");
			preparedStatement.setString(5, "D. JVM");
			preparedStatement.setString(6, "C. JDK");
			int a = preparedStatement.executeUpdate();
			System.out.println(a + " record inserted!");

			// Quection 2

			preparedStatement.setString(1, "Quection : What is the extension of java code files?");
			preparedStatement.setString(2, "A. .jst");
			preparedStatement.setString(3, "B. .txt");
			preparedStatement.setString(4, "C. .class");
			preparedStatement.setString(5, "D. .java");
			preparedStatement.setString(6, "D. .java");
			int a1 = preparedStatement.executeUpdate();
			System.out.println(a1 + " record inserted!");

			// Quection 3
			preparedStatement.setString(1, "Quection : Which of the following is not an OOPS concept in Java?");
			preparedStatement.setString(2, "A. Polymorphism");
			preparedStatement.setString(3, "B. Inheritance");
			preparedStatement.setString(4, "C. Compilation");
			preparedStatement.setString(5, "D. Encapsulation");
			preparedStatement.setString(6, "C. Compilation");
			int a2 = preparedStatement.executeUpdate();
			System.out.println(a2 + " record inserted!");

			// Quection 4
			preparedStatement.setString(1,
					"Quection : Which of the following is a type of polymorphism in Java Programming?");
			preparedStatement.setString(2, "A. Multiple polymorphism");
			preparedStatement.setString(3, "B. Compile time polymorphism");
			preparedStatement.setString(4, "C. Multilevel polymorphism");
			preparedStatement.setString(5, "D. Execution time polymorphism");
			preparedStatement.setString(6, "B. Compile time polymorphism");
			int a3 = preparedStatement.executeUpdate();
			System.out.println(a3 + " record inserted!");

			// Quection 5
			preparedStatement.setString(1, "Quection : Which exception is thrown when java is out of memory?");
			preparedStatement.setString(2, "A. MemoryError");
			preparedStatement.setString(3, "B. OutOfMemoryError");
			preparedStatement.setString(4, "C. MemoryOutOfBoundsException");
			preparedStatement.setString(5, "D. MemoryFullException");
			preparedStatement.setString(6, "C. MemoryOutOfBoundsException");
			int a4 = preparedStatement.executeUpdate();
			System.out.println(a4 + " record inserted!");

			// Quection 6
			preparedStatement.setString(1, "Quection : Which of the following is a superclass of every class in Java");
			preparedStatement.setString(2, "A. Array List");
			preparedStatement.setString(3, "B. Abstract class");
			preparedStatement.setString(4, "C. Object class");
			preparedStatement.setString(5, "D. String");
			preparedStatement.setString(6, "C. Object class");
			int a5 = preparedStatement.executeUpdate();
			System.out.println(a5 + " record inserted!");

			// Quection 7
			preparedStatement.setString(1, "Quection : Which statement is true about Java?");
			preparedStatement.setString(2, "A. Java is a sequence-dependent programming language");
			preparedStatement.setString(3, "B. Java is a code dependent programming language");
			preparedStatement.setString(4, "C. Java is a platform-dependent programming language");
			preparedStatement.setString(5, "D. Java is a platform-independent programming language");
			preparedStatement.setString(6, "D. Java is a platform-independent programming language");
			int a6 = preparedStatement.executeUpdate();
			System.out.println(a1 + " record inserted!");

			// Quection 8
			preparedStatement.setString(1,
					"Quection : Which of these packages contains the exception Stack Overflow in Java?");
			preparedStatement.setString(2, "A. java.io");
			preparedStatement.setString(3, "B. java.system");
			preparedStatement.setString(4, "C. java.lang");
			preparedStatement.setString(5, "D. java.util");
			preparedStatement.setString(6, "C. java.lang");
			int a7 = preparedStatement.executeUpdate();
			System.out.println(a7 + " record inserted!");

			// Quection 9
			preparedStatement.setString(1, "Quection : Which one of the following is not a Java feature?");
			preparedStatement.setString(2, "A. Object-oriented");
			preparedStatement.setString(3, "B. Use of pointers");
			preparedStatement.setString(4, "C. Portable");
			preparedStatement.setString(5, "D. Dynamic and Extensible");
			preparedStatement.setString(6, "B. Use of pointers");
			int a8 = preparedStatement.executeUpdate();
			System.out.println(a8 + " record inserted!");

			// Quection 10
			preparedStatement.setString(1, "Quection : What is not the use of “this” keyword in Java?");
			preparedStatement.setString(2,
					"A. Referring to the instance variable when a local variable has the same name");
			preparedStatement.setString(3, "B. Passing itself to the method of the same class");
			preparedStatement.setString(4, "C. Passing itself to another method");
			preparedStatement.setString(5, "D. Calling another constructor in constructor chaining");
			preparedStatement.setString(6, "B. Passing itself to the method of the same class");
			int a9 = preparedStatement.executeUpdate();
			System.out.println(a9 + " record inserted!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			con.close();
			preparedStatement.close();

		}
	}

}
