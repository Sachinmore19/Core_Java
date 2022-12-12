package com.velocity.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class MainLogic {
	public static int correctAnscount=0;
	public static  int wrongAnswercount=0;
	
	

	public  int logic() throws SQLException {
		
		Connection con = null;
		PreparedStatement ps = null;
		String que1 = null;
		String que2 = null;
		String que3 = null;
		String que4 = null;
		String que5 = null;
		String que6 = null;
		String que7 = null;
		String que8 = null;
		String que9 = null;
		String que10 = null;
		
		String aopt1=null;
		String aopt2=null;
		String aopt3=null;
		String aopt4=null;
		String aopt5=null;
		String aopt6=null;
		String aopt7=null;
		String aopt8=null;
		String aopt9=null;
		String aopt10=null;
		
		String bopt1=null;
		String bopt2=null;
		String bopt3=null;
		String bopt4=null;
		String bopt5=null;
		String bopt6=null;
		String bopt7=null;
		String bopt8=null;
		String bopt9=null;
		String bopt10=null;
		
		String copt1=null;
		String copt2=null;
		String copt3=null;
		String copt4=null;
		String copt5=null;
		String copt6=null;
		String copt7=null;
		String copt8=null;
		String copt9=null;
		String copt10=null;
		
		String dopt1=null;
		String dopt2=null;
		String dopt3=null;
		String dopt4=null;
		String dopt5=null;
		String dopt6=null;
		String dopt7=null;
		String dopt8=null;
		String dopt9=null;
		String dopt10=null;
		
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Sachin@123");
			
			ps = con.prepareStatement("select * from quections where id= 1");
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				 que1 = rs.getString("Quection");
				
			}
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 2");
		
			ResultSet rs2 = ps.executeQuery();
			while (rs2.next()) {
				 que2 = rs2.getString("Quection");
			}
				 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 3");
				
			ResultSet rs3 = ps.executeQuery();
			while (rs3.next()) {
			 que3 = rs3.getString("Quection");
			}
						 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 4");
						
			ResultSet rs4 = ps.executeQuery();
			while (rs4.next()) {
			 que4 = rs4.getString("Quection");
			}
								 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 5");
			
			ResultSet rs5 = ps.executeQuery();
			while (rs5.next()) {
			que5 = rs5.getString("Quection");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 6");
			
			ResultSet rs6 = ps.executeQuery();
			while (rs6.next()) {
			que6 = rs6.getString("Quection");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 7");
			
			ResultSet rs7 = ps.executeQuery();
			while (rs7.next()) {
			que7 = rs7.getString("Quection");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 8");
			
			ResultSet rs8 = ps.executeQuery();
			while (rs8.next()) {
			que8 = rs8.getString("Quection");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 9");
			
			ResultSet rs9 = ps.executeQuery();
			while (rs9.next()) {
			que9 = rs9.getString("Quection");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 10");
			
			ResultSet rs10 = ps.executeQuery();
			while (rs10.next()) {
			que10 = rs10.getString("Quection");
			}
			
			//*****************************Option 1*********************************************
			
			ps = con.prepareStatement("select * from quections where id= 1");
			
			ResultSet op = ps.executeQuery();
			while (op.next()) {
				 aopt1 = op.getString("Option1");
				
			}
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 2");
		
			ResultSet op1 = ps.executeQuery();
			while (op1.next()) {
				aopt2 = op1.getString("Option1");
			}
				 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 3");
				
			ResultSet op2 = ps.executeQuery();
			while (op2.next()) {
				aopt3 = op2.getString("Option1");
			}
						 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 4");
						
			ResultSet op3 = ps.executeQuery();
			while (op3.next()) {
				aopt4 = op3.getString("Option1");
			}
								 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 5");
			
			ResultSet op4 = ps.executeQuery();
			while (op4.next()) {
				aopt5 = op4.getString("Option1");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 6");
			
			ResultSet op5 = ps.executeQuery();
			while (op5.next()) {
				aopt6 = op5.getString("Option1");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 7");
			
			ResultSet op6 = ps.executeQuery();
			while (op6.next()) {
				aopt7 = op6.getString("Option1");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 8");
			
			ResultSet op7 = ps.executeQuery();
			while (op7.next()) {
				aopt8 = op7.getString("Option1");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 9");
			
			ResultSet op8 = ps.executeQuery();
			while (op8.next()) {
				aopt9 = op8.getString("Option1");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 10");
			
			ResultSet op9 = ps.executeQuery();
			while (op9.next()) {
				aopt10 = op9.getString("Option1");
			}
			
			//******************option2********************************************
			

			ps = con.prepareStatement("select * from quections where id= 1");
			
			ResultSet op11 = ps.executeQuery();
			while (op11.next()) {
				 bopt1 = op11.getString("Option2");
				
			}
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 2");
		
			ResultSet op12 = ps.executeQuery();
			while (op12.next()) {
				bopt2 = op12.getString("Option2");
			}
				 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 3");
				
			ResultSet op13 = ps.executeQuery();
			while (op13.next()) {
				bopt3 = op13.getString("Option2");
			}
						 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 4");
						
			ResultSet op14 = ps.executeQuery();
			while (op14.next()) {
				bopt4 = op14.getString("Option2");
			}
								 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 5");
			
			ResultSet op15 = ps.executeQuery();
			while (op15.next()) {
				bopt5 = op15.getString("Option2");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 6");
			
			ResultSet op16 = ps.executeQuery();
			while (op16.next()) {
				bopt6 = op16.getString("Option2");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 7");
			
			ResultSet op17 = ps.executeQuery();
			while (op17.next()) {
				bopt7 = op17.getString("Option2");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 8");
			
			ResultSet op18 = ps.executeQuery();
			while (op18.next()) {
				bopt8 = op18.getString("Option2");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 9");
			
			ResultSet op19 = ps.executeQuery();
			while (op19.next()) {
				bopt9 = op19.getString("Option2");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 10");
			
			ResultSet op20 = ps.executeQuery();
			while (op20.next()) {
				bopt10 = op20.getString("Option2");
			}
			
			//******************************option 3****************************************
			
			
			ps = con.prepareStatement("select * from quections where id= 1");
			
			ResultSet op21 = ps.executeQuery();
			while (op21.next()) {
				 copt1 = op21.getString("Option3");
				
			}
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 2");
		
			ResultSet op22 = ps.executeQuery();
			while (op22.next()) {
				copt2 = op22.getString("Option3");
			}
				 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 3");
				
			ResultSet op23 = ps.executeQuery();
			while (op23.next()) {
				copt3 = op23.getString("Option3");
			}
						 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 4");
						
			ResultSet op24 = ps.executeQuery();
			while (op24.next()) {
				copt4 = op24.getString("Option3");
			}
								 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 5");
			
			ResultSet op25 = ps.executeQuery();
			while (op25.next()) {
				copt5 = op25.getString("Option3");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 6");
			
			ResultSet op26 = ps.executeQuery();
			while (op26.next()) {
				copt6 = op26.getString("Option3");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 7");
			
			ResultSet op27 = ps.executeQuery();
			while (op27.next()) {
				copt7 = op27.getString("Option3");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 8");
			
			ResultSet op28 = ps.executeQuery();
			while (op28.next()) {
				copt8 = op28.getString("Option3");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 9");
			
			ResultSet op29 = ps.executeQuery();
			while (op29.next()) {
				copt9 = op29.getString("Option3");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 10");
			
			ResultSet op30 = ps.executeQuery();
			while (op30.next()) {
				copt10 = op30.getString("Option3");
			}
			
			
			//*************************option4******************************************
			
			
			ps = con.prepareStatement("select * from quections where id= 1");
			
			ResultSet op31 = ps.executeQuery();
			while (op31.next()) {
				 dopt1 = op31.getString("Option4");
				
			}
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 2");
		
			ResultSet op32 = ps.executeQuery();
			while (op32.next()) {
				dopt2 = op32.getString("Option4");
			}
				 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 3");
				
			ResultSet op33 = ps.executeQuery();
			while (op33.next()) {
				dopt3 = op33.getString("Option4");
			}
						 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 4");
						
			ResultSet op34 = ps.executeQuery();
			while (op34.next()) {
				dopt4 = op34.getString("Option4");
			}
								 
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 5");
			
			ResultSet op35 = ps.executeQuery();
			while (op35.next()) {
				dopt5 = op35.getString("Option4");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 6");
			
			ResultSet op36 = ps.executeQuery();
			while (op36.next()) {
				dopt6 = op36.getString("Option4");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 7");
			
			ResultSet op37 = ps.executeQuery();
			while (op37.next()) {
				dopt7 = op37.getString("Option4");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 8");
			
			ResultSet op38 = ps.executeQuery();
			while (op38.next()) {
				dopt8 = op38.getString("Option4");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 9");
			
			ResultSet op39 = ps.executeQuery();
			while (op39.next()) {
				dopt9 = op39.getString("Option4");
			}
			
			//**************************************************************************
			ps = con.prepareStatement("select * from quections where id= 10");
			
			ResultSet op40 = ps.executeQuery();
			while (op40.next()) {
				dopt10 = op40.getString("Option4");
			}
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
			ps.close();
		}

		
		
		Question quection1=new Question(que1,aopt1,bopt1,copt1,dopt1);
		Question quection2=new Question(que2,aopt2,bopt2,copt2,dopt2);
		Question quection3=new Question(que3,aopt3,bopt3,copt3,dopt3);
		Question quection4=new Question(que4,aopt4,bopt4,copt4,dopt4);
		Question quection5=new Question(que5,aopt5,bopt5,copt5,dopt5);
		Question quection6=new Question(que6,aopt6,bopt6,copt6,dopt6);
		Question quection7=new Question(que7,aopt7,bopt7,copt7,dopt7);
		Question quection8=new Question(que8,aopt8,bopt8,copt8,dopt8);
		Question quection9=new Question(que9,aopt9,bopt9,copt9,dopt9);
		Question quection10=new Question(que10,aopt10,bopt10,copt10,dopt10);
		
		 Map<Question,Character> hmap=new HashMap<Question,Character>();
		    hmap.put(quection1, 'C');
			hmap.put(quection2, 'D');
			hmap.put(quection3, 'C');
			hmap.put(quection4, 'B');
			hmap.put(quection5, 'C');
			hmap.put(quection6, 'C');
			hmap.put(quection7, 'D');
			hmap.put(quection8, 'C');
			hmap.put(quection9, 'B');
			hmap.put(quection10, 'B');
			 
			
			
			 for(Map.Entry<Question, Character>map:hmap.entrySet()) {
				 System.out.println(map.getKey().getQuestion());
				 System.out.println(map.getKey().getOption1());
				 System.out.println(map.getKey().getOption2());
				 System.out.println(map.getKey().getOption3());
				 System.out.println(map.getKey().getOption4());
				 Scanner sc=new Scanner(System.in);
				 System.out.println("Enter your answer:- ");
				 Character ans=sc.next().charAt(0);
				 int cans=Character.compare(ans,((Entry<Question, Character>) map).getValue());
	
				 if(cans==0) {
					 correctAnscount++;
				 }else {
					 wrongAnswercount++;
				 
				 }
				 
				 
				 
			 }	 
				 
			 
			 return correctAnscount; 
	}
	
		
	
		
		

	
	

}
