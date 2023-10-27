package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.dto.ProductOwner;
import com.jsp.jcart_web_app.service.ProductOwnerService;

@WebServlet(value = "/registerOwner")
public class ProductOwnerRegisterController  extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("ownerName");
		String email = req.getParameter("ownerEmail");
		String pass = req.getParameter("ownerPassword");
		long phone = Long.parseLong(req.getParameter("ownerPhone"));
		
		ProductOwner owner=new ProductOwnerService()
				.saveProductOwnerService(
						new ProductOwner(name, email, pass, phone));
		
		if(owner!=null) {
			req.getRequestDispatcher("owner-login.jsp").forward(req, resp);
		}else {
			req.setAttribute("passMessage", "Please check your password");
			req.getRequestDispatcher("owner-register.jsp").forward(req, resp);
		}
	}
}
