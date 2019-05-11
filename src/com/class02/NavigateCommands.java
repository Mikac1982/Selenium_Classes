package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException{ //not to get an error for thread.sleep
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();		
		
		//pass full url 
		driver.navigate().to("http://www.walmart.com"); //let our driver navigate to web site where we want to go
		//slows down so we can see what is going on-> wait until next step 
		Thread.sleep(1000); //1 secund
		driver.navigate().to("http://google.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		
		//to refresh the page
		driver.navigate().refresh(); //refresh google
		
		driver.close();
		
	}
}
