package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
	
//	System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
//	WebDriver driver=new ChromeDriver();
//	driver.get("http:google.com");
	//opening chrome driver
	System.setProperty("webdriver.gecko.driver", "/Users/milenasibalic/Selenium/chromedriver");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http:google.com");
	
	String url=driver.getTitle();
	System.out.println(url);
	
	driver.close();
	}
}
