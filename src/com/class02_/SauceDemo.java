package com.class02_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.saucedemo.com");
		                                    //we are passing(sending) some keys/value into text box username!
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		//for log in we are not passing any keys, just have to click on it -> .click();
		driver.findElement(By.className("btn_action")).click();
		Thread.sleep(1000);
		
		driver.close();
		
		
	}
}
