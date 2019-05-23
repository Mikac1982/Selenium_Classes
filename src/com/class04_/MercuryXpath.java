package com.class04_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryXpath {
	
    public static void main(String[] args) throws InterruptedException {
		
    	System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
    //	driver.findElement(By.id("email")).sendKeys("milena123");
    	driver.findElement(By.xpath("//input[contains(@name,'mail')]")).sendKeys("milena123");
    	driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("mika");
    	driver.findElement(By.xpath("//input[starts-with(@name,'conf')]")).sendKeys("mika");
    	driver.findElement(By.xpath("//input[contains(@name,'regis')]")).click();
    	
    	Thread.sleep(2000);
    	driver.quit();
    	
    	
	}
}
