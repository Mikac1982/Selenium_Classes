package com.class05_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveLogin {
		//Open chrome browser
		//Go to “https://www.saucedemo.com/”
		//Enter valid username and valid password and click login
		//Verify robot icon is displayed
		//Verify “Products” text is available next to the robot icon
	
	public static void main(String[] args) {
		
		String userName="standard_user";
		String password="secret_sauce";
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		
		
		
		
		
		
		
		
		
		
		
	}
}
