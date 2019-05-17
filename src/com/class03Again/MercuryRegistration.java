package com.class03Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryRegistration {
	 // Mercury Tours Registration:
	  //	Open chrome browser
	  //	Go to “http://newtours.demoaut.com/”
	  //	Click on Register Link
	  //	Fill out all required info
	  //	Click Submit
	  //	User successfully registered
	  //	(Create 2 scripts using different locators)
	
	public static void main(String[] args) throws InterruptedException {
		                                            //location where our drivers are located
	System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("http://newtours.demoaut.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("REGISTER")).click();
	
	driver.findElement(By.name("firstName")).sendKeys("milena");
	driver.findElement(By.name("lastName")).sendKeys("sibalic");
	driver.findElement(By.name("phone")).sendKeys("222-333-4444");
	driver.findElement(By.id("userName")).sendKeys("milena123");
	driver.findElement(By.name("address1")).sendKeys("123 kalorama rd");
	driver.findElement(By.name("address2")).sendKeys("126 kalorama rd");
	driver.findElement(By.name("city")).sendKeys("washington");
	driver.findElement(By.name("state")).sendKeys("DC");
	driver.findElement(By.name("postalCode")).sendKeys("20009");
	driver.findElement(By.id("email")).sendKeys("milena.sibalic@gmail.com");
	driver.findElement(By.name("password")).sendKeys("123mmm");
	driver.findElement(By.name("confirmPassword")).sendKeys("123mmm");
	Thread.sleep(2000);
	driver.findElement(By.name("register")).click();
	
//	driver.close();	
		
		
		
		
		
	}
}
