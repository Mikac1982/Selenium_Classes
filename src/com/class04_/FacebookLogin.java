package com.class04_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//relative xpath
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sibalic.milena@gmail.com");
		//starts-with()
		driver.findElement(By.xpath("//input[starts-with(@name,'pa')]")).sendKeys("johnsmith1");
		//contains()
		driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();
		
		//a[text()='Forgot account?']
		//a[starts-with(text(),'For')]
		//a[contains(text(),'account')]
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'pa')]")).sendKeys("johnsmith1");
		driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		
		
		
		
		
		driver.close();
		
	}
}
