package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException{
		
		//opening chrome driver
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();	
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("placeholder");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("placeholder");
		Thread.sleep(2000);
		driver.findElement(By.className("login_logo")).click();;
		
		driver.close();
		
		
		
	}
}
