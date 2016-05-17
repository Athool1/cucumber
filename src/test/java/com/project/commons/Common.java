/**
 * 
 */
package com.project.commons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

/**
 * @author Ashay
 *
 */
public class Common {
	public static WebDriver driver;
	public static WebElement element;
	
	
	public void chooseDriver(String browser){
		if(browser == "chrome"){
			System.setProperty("webdriver.chrome.driver", "D:/workspace/cucumber/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Driver Active");
		}else if(browser =="firefox"){
			driver =new FirefoxDriver();
			System.out.println("FireFox Driver Active");
		}else if(browser =="ie"){
			driver =new InternetExplorerDriver();
			System.out.println("IE Driver Active");
		}
	}
	
	public void openBrowser(){
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Open and Maximize the Browser");
	}
	
	public void closeBrowser(){
		driver.quit(); 
		System.out.println("close browser");

	}
	
	public void goToURL(String sURL){
		driver.get(sURL);
		System.out.println("Opening the URL");
	}
	
	public void clickByXpath(String sxpath){
		try{
			driver.findElement(By.xpath(sxpath)).click();
			System.out.println(sxpath+"=found");
		}catch(Exception e){
			System.out.println(sxpath+"=not found");
			Assert.fail("Link not found");
		}
	}
	
	public void setValueByName(String sname, String svalue){
		try{
			driver.findElement(By.name(sname)).sendKeys(svalue);
			System.out.println(svalue+"=entered");
		}catch(Exception e){
			System.out.println(sname+"=not found");
			Assert.fail("Not Found");
		}
	}
	
}
