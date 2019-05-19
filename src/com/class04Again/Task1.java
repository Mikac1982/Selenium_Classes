package com.class04Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[contains(@id,'-name')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[starts-with(@class,'btn')]")).click();
		
		driver.close();
		
	}
}
