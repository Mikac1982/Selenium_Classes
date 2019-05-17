package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginXpath {
	//Using Xpath ONLY
	//Open chrome browser
	//Go to “https://www.facebook.com/”
	//Enter valid username and valid password and click login
	//User successfully logged in
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sibalic.milena@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("johnsmith1");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		driver.close();
		
		
		
		
	}
}
