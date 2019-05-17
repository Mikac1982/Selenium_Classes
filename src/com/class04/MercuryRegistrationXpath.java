package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryRegistrationXpath {
	      // Mercury Tours Registration:
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
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'mail')]")).sendKeys("smith");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]")).sendKeys("pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'reg')]")).click();
		
		
		
		
		
		
		
	}
}
