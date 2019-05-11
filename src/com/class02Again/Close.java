package com.class02Again;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();		
		
		driver.get("hhtp://cnn.com"); //send me to cnn
		Thread.sleep(2000);
	//	driver.close();               //closing the browser
		
		driver.get("http://adidas.com");
		driver.close();
		
	}
}
