package com.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.makemytrip.com/");
		
		WebElement dropDown=driver.findElement(By.id("fromCity"));
	//	dropDown.click();
	
		dropDown.sendKeys("MUM");
		dropDown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		dropDown.sendKeys(Keys.ENTER);
	
		
		WebElement destination=driver.findElement(By.id("toCity"));
		destination.click();	
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		for (int i=1; i<5; i++) {
		      destination.sendKeys(Keys.ARROW_DOWN);
		}
		destination.sendKeys(Keys.ENTER);
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}
}
