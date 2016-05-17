/**
 * 
 */
package com.project.pageobjects;

import com.project.commons.Common;

/**
 * @author Ashay
 *
 */
public class HomePage {
	
	public Common cm = new Common();
	public String path = ".//*[@id='bodyContent']/div/div[1]/a[1]/u";
	public String logOffPath = ".//*[@id='tdb4']/span";
	
	public void clickLogInYourselfLink(){
		cm.clickByXpath(path);
	}
	
	public void clickLogOffButton(){
		cm.clickByXpath(logOffPath);
	}
}
