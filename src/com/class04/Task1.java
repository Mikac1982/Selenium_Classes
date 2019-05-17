package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","/Users/milenasibalic/Selenium/chromedriver");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("standard_user");	
	driver.findElement(By.xpath("//input[starts-with(@type,'pass')]")).sendKeys("secret_sauce");	
	driver.findElement(By.xpath("//input[starts-with(@type,'sub')]")).click();
		
		
		
		
	}
}
