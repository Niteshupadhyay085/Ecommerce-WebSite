package com.jsp.jcart_web_app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.jcart_web_app.connection.UserConnection;
import com.jsp.jcart_web_app.dto.Admin;

public class AdminDao {

	Connection connection = UserConnection.getUserConnection();
	
	public Admin adminLoginWithEmailPassDao(String adminEmail) {
		
		String selectAdminQuery = "SELECT * FROM admin WHERE email = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(selectAdminQuery);
			
			preparedStatement.setString(1, adminEmail);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				
				return new Admin(
						resultSet.getString("email"),
						resultSet.getString("password")
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	
	}
}
