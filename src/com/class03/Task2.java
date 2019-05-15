package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
  // Mercury Tours Registration:
  //	Open chrome browser
  //	Go to “http://newtours.demoaut.com/”
  //	Click on Register Link
  //	Fill out all required info
  //	Click Submit
  //	User successfully registered
  //	(Create 2 scripts using different locators)
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");		
		WebDriver driver=new ChromeDriver();	
		
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Smith");
		driver.findElement(By.name("phone")).sendKeys("202-303-4444");
		driver.findElement(By.id("userName")).sendKeys("helloworld");
		driver.findElement(By.name("address1")).sendKeys("123 calorama rd");
		driver.findElement(By.name("address2")).sendKeys("125 columbia rd nw");
		driver.findElement(By.name("city")).sendKeys("Washington dc");
		driver.findElement(By.name("state")).sendKeys("DC");
		driver.findElement(By.name("postalCode")).sendKeys("20009");
		driver.findElement(By.name("state")).sendKeys("DC");
	//	driver.findElement(By.name("country")).sendKeys("USA");
		driver.findElement(By.id("email")).sendKeys("johnsmith@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123johnsmith");
		driver.findElement(By.name("confirmPassword")).sendKeys("123johnsmith");
		driver.findElement(By.name("register")).click();
		
		
		
		
		
	}
}
