package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//tag and attributes
		driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		//tag and ID
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		//tag and Class
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		
	}
}
