package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		
	//passing key -> webdriver.chrome.driver, and value-path location where we store chrome driver
	//key value will be different depending on web driver
		
//	System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
//	WebDriver driver= new ChromeDriver();	
//	driver.get("http:google.com");	//heading to google, passing string parameters //to pass URL 
//	driver.get("http://facebook.com");
//	driver.get("http://amazon.com");
	
		
	System.setProperty("webdriver.gecko.driver", "/Users/milenasibalic/Selenium/geckodriver");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://adidas.com");
	
	driver.close();
	}
}
