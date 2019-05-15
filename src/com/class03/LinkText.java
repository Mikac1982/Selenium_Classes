package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");		
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");	
	Thread.sleep(2000);	
	
	//driver.findElement(By.linkText("Link Test")).click();
	
	driver.findElement(By.partialLinkText("Partial Link")).click();
		
	}
}
