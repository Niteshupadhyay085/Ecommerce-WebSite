package com.jsp.jcart_web_app.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserConnection {

	public static Connection getUserConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/j-cart-web-app", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
