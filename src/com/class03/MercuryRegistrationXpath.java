package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryRegistrationXpath {
	//Mercury Tours Registration:
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
	//	driver.findElement(By.linkText("REGISTER")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("smith");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("202-333-4444");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123 Kalorama rd");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("33 columbia rd nw");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Washington");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("DC");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("20009");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hellojohn1");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("hellojohn1");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
		
	}
}
