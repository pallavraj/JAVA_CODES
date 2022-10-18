package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to Delete student");
			System.out.println("PRESS 3 to Display student");
			System.out.println("PRESS 4 to Exit");
			
			int n = Integer.parseInt(br.readLine());
			
			if(n==1) {
				System.out.println("ENTER Student name");
				String name = br.readLine();
				
				System.out.println("ENTER Student phone number");
				String phone = br.readLine();
				
				System.out.println("ENTER Student city");
				String city = br.readLine();
				
				student st = new student(name,phone,city);
				boolean a = studentDao.insertStudentToDB(st);
				if(a==true) {
					System.out.println("STUDENT ADDED");
				}
				else {
					System.out.println("SOMETHING WENT WRONG TRY AGAIN!");
				}
			}
			else if(n==2) {
				System.out.println("ENTER STUDENT ID TO DELETE");
				int d = Integer.parseInt(br.readLine());
				boolean df = studentDao.delete(d);
				if(df==true) {
					System.out.println("STUDENT DELETED");
				}
				else {
					System.out.println("SOMETHING WENT WRONG TRY AGAIN!");
				}
			}
			else if(n==3) {
				
				studentDao.showAll();
				
			}
			else if(n==4) {
				break;
			}
			else {
				//continue
			}
		}
		System.out.println("THANK YOU FOR CHOOSING US, SEE YOU SOON");

	}

}
