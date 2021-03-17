package com.ltts.ServletProject.configure;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	

	public static Connection getConnection() throws Exception
	{

Class.forName("com.mysql.cj.jdbc.Driver");
//		Class.forName("com.mysql.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/pk","root","Pavitra1@");
		return c;
		
	}

}
