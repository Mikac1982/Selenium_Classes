package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssFacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");	
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("sibalic.milena@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("johnsmith1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		
		
		
		
		
	}
	
	
	
}
