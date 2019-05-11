package com.class02Again;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();	
		
		//navigate WebDriver to go to the web site we want
		driver.navigate().to("http://www.walmart.com"); 
		
		//slows down your script so we can see what's going on;wait until next steep
		Thread.sleep(1000); 
		driver.navigate().to("http://google.com");
		Thread.sleep(1000);
		driver.navigate().back();        //going back to walmart 
		Thread.sleep(1000);
		driver.navigate().forward();     //going forward to google
		Thread.sleep(1000); 
		
		driver.navigate().refresh();  //to refresh current page
		Thread.sleep(1000); 
		
		driver.close();  //close current tag
		
	}
}
