package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Arif {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");	
		
	driver.findElement(By.xpath("//input[contains(@id,'-name')]")).sendKeys("standard_user");	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("secret_sauce");	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[starts-with(@class,'btn')]"))	.click();
	
	driver.close();
	}
}
