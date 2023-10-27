package com.jsp.jcart_web_app.service;

import com.jsp.jcart_web_app.dao.AdminDao;
import com.jsp.jcart_web_app.dto.Admin;

public class AdminService {

	AdminDao adminDao = new AdminDao();
	
	public Admin adminLoginWithEmailPassService(String adminEmail) {
		return adminDao.adminLoginWithEmailPassDao(adminEmail);
	}
}
