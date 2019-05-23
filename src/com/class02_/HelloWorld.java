package com.class02_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
	//	WebDriver driver= new ChromeDriver();
	//	driver.get("http://google.com");
	//	driver.get("http://amazon.com");
		
		System.setProperty("webdriver.gecko.driver", "/Users/milenasibalic/Selenium/geckodriver");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("http://cnn.com");
		
		
		
	}
}
