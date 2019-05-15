package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
  /* Syntax Page URL Verification:
     Open chrome browser
     Navigate to “https://www.syntaxtechs.com/”
     Navigate to “https://www.google.com/”
     Navigate back to Syntax Technologies Page
     Refresh current page
     Verify url contains “Syntax”
   */
	
	public static void main(String[] args) throws InterruptedException{
		//opening chrome driver
	System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.syntaxtechs.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://google.com");	
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	String url=driver.getCurrentUrl();
	if (url.contains("syntax")) {
		System.out.println("This is the right url");
	}else {
		System.out.println("Sorry, this is not right url");
	}
	
	driver.close();	

//	String title=driver.getTitle();
//	System.out.println(title);
//	if (title.contains("Syntax")) {
//		System.out.println("This is the right url");
//	}else {
//		System.out.println("Sorry, not right url");
//	}
	
	
	
	
	
	}
}
