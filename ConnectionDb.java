package com.dbms;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDb {
	static Connection con=null;
	public static Connection connectDb() {
		try {
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//established the connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Simple@33");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
