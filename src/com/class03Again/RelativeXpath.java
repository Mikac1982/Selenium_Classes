package com.class03Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
	WebDriver driver=new ChromeDriver();	//webdriver-interface so we have to import it
		
	driver.navigate().to("https://www.saucedemo.com");	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
	//driver.close();
	
	
		
	}
}
