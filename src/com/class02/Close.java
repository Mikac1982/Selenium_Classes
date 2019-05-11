package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) {
		//opening chrome driver
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();		
		
		driver.get("http://cnn.com");
	//	driver.close();
		driver.quit();
		
		driver.get("http://adidas.com");
		
		
		
		
	}
}
