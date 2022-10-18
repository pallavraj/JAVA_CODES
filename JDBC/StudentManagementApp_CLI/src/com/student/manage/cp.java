package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class cp {

	static Connection con;
	
	public static Connection create() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user = "root";
			String password = "admin";
			String url = "jdbc:mysql://localhost:3307/student_manage";
			
			con = DriverManager.getConnection(url,user,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
}
