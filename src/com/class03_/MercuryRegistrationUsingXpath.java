package com.class03_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryRegistrationUsingXpath {
	// Mercury Tours Registration:
	  //	Open chrome browser
	  //	Go to “http://newtours.demoaut.com/”
	  //	Click on Register Link
	  //	Fill out all required info
	  //	Click Submit
	  //	User successfully registered
	 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");		
		WebDriver driver=new ChromeDriver();	
		
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//a[@href='mercuryregister.php']")).click();
		
		
		
		
		
		
	}
}
