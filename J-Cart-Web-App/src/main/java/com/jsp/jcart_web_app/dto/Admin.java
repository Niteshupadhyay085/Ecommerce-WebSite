package com.jsp.jcart_web_app.dto;

public class Admin {

	private int adminId;
	private String adminName;
	private String adminEmail;
	private String adminPass;
	
	public Admin() {
		super();
	}
	

	public Admin(String adminEmail, String adminPass) {
		super();
		this.adminEmail = adminEmail;
		this.adminPass = adminPass;
	}


	public Admin(int adminId, String adminName, String adminEmail, String adminPass) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPass = adminPass;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPass() {
		return adminPass;
	}

	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
}
