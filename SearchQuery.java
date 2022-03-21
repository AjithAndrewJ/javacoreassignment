package com.dbms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchQuery {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Connection con=ConnectionDb.connectDb();
			
			String sql="select * from bank where accno=?;";
			
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println("Enter your account number: ");
			String accno=sc.nextLine();
			ps.setString(1,accno);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("==========================================");
				System.out.println("Account number: "+ rs.getString(1) +"\nAccount holder name: "+ rs.getString(2) +"\nAccount balance: "+ rs.getLong(3));
			    System.out.println("==========================================");
			}
			
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}
