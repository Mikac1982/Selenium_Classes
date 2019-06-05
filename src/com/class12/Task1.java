package com.class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.utilis.CommonMethods;

public class Task1 extends CommonMethods {
 /* OrangeHRM Login
    Navigate to “https://opensource-demo.orangehrmlive.com/”
    Login to the application
    Verify user is successfully logged in
    Note: must use properties file
  */
	Properties prop;
	
	@Test
	public void readFile() {
		
		String filePath="src/configs/credentials2.properties";
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 String browser=prop.getProperty("browser");
		 String url=prop.getProperty("url");
		 String username=prop.getProperty("username");
		 String password=prop.getProperty("password");
		 
		 setUpDriver(browser, url);
		 
		 sendText(driver.findElement(By.cssSelector("input#txtUsername")), username);
		 sendText(driver.findElement(By.cssSelector("input#txtPassword")), password);
		 click(driver.findElement(By.cssSelector("input#btnLogin")));
		 
	     }
	
		 @Test
		 public void verify() {
			 
			 String expected="Dashboard";
			 String actual=driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText();
			 
			 Assert.assertEquals(actual, expected);
			 System.out.println("Actual text "+actual+" matches with "+expected);
			 System.out.println("User is successfully logged in ");
			 
			 driver.quit();
		 }
		 
		 
		 
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
