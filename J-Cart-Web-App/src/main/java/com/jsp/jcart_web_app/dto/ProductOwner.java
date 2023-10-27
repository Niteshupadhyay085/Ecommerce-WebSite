package com.jsp.jcart_web_app.dto;

public class ProductOwner {

	private int id;
	private String name;
	private String email;
	private String password;
	private long phone;
	private String verify;
	
	
	public ProductOwner() {
		super();
	}

	

	public ProductOwner(String email, String password, String verify) {
		super();
		this.email = email;
		this.password = password;
		this.verify = verify;
	}







	public ProductOwner(int id, String name, String email, String password, long phone, String verify) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.verify = verify;
	}







	public ProductOwner(String name, String email, String password, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}



	public ProductOwner(int id, String name, String email, String password, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}



	public String getVerify() {
		return verify;
	}



	public void setVerify(String verify) {
		this.verify = verify;
	}
	
	
}
