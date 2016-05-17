package com.project.pageobjects;

import com.project.commons.Common;

public class LoginPage {

	public Common cm = new Common();
	public String uname = "email_address";
	public String pwd = "password";
	public String path =".//*[@id='tdb5']";
	
	
	public void enterUsername(String u_value){
		cm.setValueByName(uname, u_value);
	}
	
	public void enterPassword(String p_value){
		cm.setValueByName(pwd, p_value);
	}
	
	public void clickLogInButton(){
	    cm.clickByXpath(path);
	}

}
