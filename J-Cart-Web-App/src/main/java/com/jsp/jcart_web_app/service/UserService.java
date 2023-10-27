package com.jsp.jcart_web_app.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jsp.jcart_web_app.dao.UserDao;
import com.jsp.jcart_web_app.dto.User;

public class UserService {

	UserDao userDao = new UserDao();
	
	/*
	 * hjsvdjavjhdsabkjcabkbkbjasvj
	 */
	public User saveUserService(User user) {
		
		String password = user.getUserPassword();
		
		if(password.length()==8) {
			
			Matcher alphabet = Pattern.compile("[a-zA-Z]").matcher(password);
			Matcher number = Pattern.compile("[0-9]").matcher(password);
			Matcher special = Pattern.compile("[@#$%&*!^_]").matcher(password);
			
			if((alphabet.find())&&(number.find())&&(special.find())) {
				return userDao.saveUserDao(user);
			}else {
				return null;
			}
		}else {
			return null;
		}
	}
	
	public User loginWithUserService(String userEmail) {
		
		return userDao.loginWithUserDAo(userEmail);
	}
}
