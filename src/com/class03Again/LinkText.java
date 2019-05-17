package com.class03Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver(); 
		
		driver.navigate().to("https://www.toolsqa.com/");
		Thread.sleep(2000);
	//	driver.findElement(By.linkText("Link Test")).click();  //use entire text
		driver.findElement(By.partialLinkText("Partial Link")).click(); //use partial text
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
