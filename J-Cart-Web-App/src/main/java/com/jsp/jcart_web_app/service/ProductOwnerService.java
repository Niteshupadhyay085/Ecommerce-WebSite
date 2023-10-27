package com.jsp.jcart_web_app.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jsp.jcart_web_app.dao.ProductOwnerDao;
import com.jsp.jcart_web_app.dto.ProductOwner;

/**
 * hjssbjkbaskj
 * hjsavjchsbkjcsab
 * @author ANSARI
 *
 */
public class ProductOwnerService {

	ProductOwnerDao dao = new ProductOwnerDao();
	
	/*
	 * hvsdjbvkj cjckjbnckjx m cmvhcnh sdmn mxz 
	 */
	public ProductOwner saveProductOwnerService(ProductOwner owner) {
		
		if((owner.getPassword().length()>=8)&&(owner.getPassword().length()<=15)) {
			
			
			Matcher alphabet = Pattern.compile("[a-zA-Z]").matcher(owner.getPassword());
			Matcher number = Pattern.compile("[0-9]").matcher(owner.getPassword());
			Matcher special = Pattern.compile("[@#$%&*!^_:]").matcher(owner.getPassword());
			
			if((alphabet.find())&&(number.find())&&(special.find())) {
				return dao.saveProductOwnerDao(owner);
			}else {
				return null;
			}
		}else {
			return null;
		}
	}
	
	public ProductOwner loginWithEmailPasswordService(String email) {
		return dao.loginWithEmailPasswordDao(email);
	}
}
