package com.project.testpage.test;



import com.project.commons.*;
import com.project.pageobjects.*;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class TestPageStepDefinition {
		public HomePage homePage = new HomePage();
		public LoginPage login = new LoginPage();
		public Common common = new Common();
		
		public String sURL ="http://107.170.213.234/catalog";
		
		
		@Before
		public void setUp(){
		 common.chooseDriver("chrome");
		 common.openBrowser();
		}
		
		@Given ("^I open HomePage$")
		public void I_open_Homepage(){
			common.goToURL(sURL);
		}
		
		@When("^I click log yourself in link$")
		public void I_click_log_yourself_in_link(){
			homePage.clickLogInYourselfLink();
		}
		
		@And("^I enter \"([^\"]*)\" as Username$")
		public void I_enter_as_username(String uname){
			login.enterUsername(uname);
		}
		
		@And("^I enter \"([^\"]*)\" as Password$")
		public void I_enter_as_Password(String pass){
			login.enterPassword(pass);
		}
		
		@And("^I click on Sign In button$")
		public void I_click_on_Sign_In_button(){
			login.clickLogInButton();
		}
		
		@Then("^I click log off button")
		public void I_click_log_off_button(){
			homePage.clickLogOffButton();
		}
		
		
		@After
		public void tearDown(){
			common.closeBrowser();
		}
		
}
