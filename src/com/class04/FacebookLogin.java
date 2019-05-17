package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//contains X path
		driver.findElement(By.xpath("//input[contains(@type,'mail')]")).sendKeys("sibalic.milena@gmail.com");
		Thread.sleep(2000);
		
		//starts with X path
		driver.findElement(By.xpath("//input[starts-with(@id,'pa')]")).sendKeys("johnsmith1");
		Thread.sleep(2000);
		
		//contains X path
		driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("a[starts-with(text(),'Forgot account?')]")).click();
		//a[text()='Forgot account?']
		//a[starts-with(text(),'Forgot account?')]
		//a[contains(text(),'account?')]
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[starts-with(@id,'pa')]")).sendKeys("johnsmith1");
		
	}
}
