package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentDao {
	
	public static boolean insertStudentToDB(student st) {
		boolean f = false;
		try {
			
			Connection con = cp.create();
			
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";
			
			PreparedStatement p = con.prepareStatement(q);
			
			p.setString(1, st.getSname());
			p.setString(2, st.getSphone());
			p.setString(3,st.getScity());
			
			p.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}

	public static boolean delete(int n) {
		boolean f = false;
		try {
			
			Connection con = cp.create();
			
			String q = "delete from students where sid=?";
			
			PreparedStatement p = con.prepareStatement(q);
			
			p.setInt(1,n);
			
			p.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
		
	}

	public static void showAll() {
		
		try {
			
			Connection con = cp.create();
			
			String q = "select * from students";
			
			Statement st = con.createStatement();
			
			ResultSet set = st.executeQuery(q);
			
			while(set.next()) {
				
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);
				String phone = set.getString(4);
				System.out.println("ID -"+id);
				System.out.println("name -"+name);
				System.out.println("phone -"+phone);
				System.out.println("city -"+city);
				System.out.println();
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
