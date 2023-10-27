package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.dto.User;
import com.jsp.jcart_web_app.service.UserService;

@WebServlet(value = "/loginUser")
public class UserLoginController extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userEmail = req.getParameter("userName");
		String userPassword = req.getParameter("userPassword");
		
		UserService userService = new UserService();
		
		User user=userService.loginWithUserService(userEmail);
		
		if(user!=null) {
			
			if(user.getUserPassword().equals(userPassword)) {
				req.getRequestDispatcher("user-home.jsp").forward(req, resp);
			}else {
				req.setAttribute("incorrectPassword", "password mismatch");
				req.getRequestDispatcher("user-login.jsp").forward(req, resp);
			}
		}else {
			req.setAttribute("incorrectEmail", "email is incorrect");
			req.getRequestDispatcher("user-login.jsp").forward(req, resp);
		}
	}
}
