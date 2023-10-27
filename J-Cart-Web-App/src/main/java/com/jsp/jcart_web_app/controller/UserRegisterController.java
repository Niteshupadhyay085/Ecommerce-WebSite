package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.dto.User;
import com.jsp.jcart_web_app.service.UserService;

@WebServlet(value = "/userRegister")
public class UserRegisterController extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("userName");
		String email = req.getParameter("userEmail");
		String password = req.getParameter("userPassword");
		long phone = Long.parseLong(req.getParameter("userPhone"));
		String address = req.getParameter("userAddress");
		
		UserService service = new UserService();
		
		User user=service.saveUserService(new User(name, email, phone, password, address));
		
		if(user!=null) {
			
			req.getRequestDispatcher("user-login.jsp").forward(req, resp);
		}else {
			
			req.setAttribute("passwordMessage", "password length must be 8 and include alphanumeric ");
			
			req.getRequestDispatcher("user-register.jsp").forward(req, resp);
		}
	}
	
}
