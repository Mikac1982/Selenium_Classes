package com.class04_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[contains(@type,'mail')]")).sendKeys("sibalic.milena@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'pa')]")).sendKeys("johnsmith1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@value,'Log')]")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//a[text()='Forgot account?']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'pa')]")).sendKeys("johnsmith1");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'bmi')]")).click();
		
	}
}
