package com.class04Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryRegXpathFunctions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[starts-with(@name,'first')]")).sendKeys("mika");
		driver.findElement(By.xpath("//input[starts-with(@name,'last')]")).sendKeys("sibalic");
		driver.findElement(By.xpath("//input[starts-with(@name,'ph')]")).sendKeys("202-333-4444");
		driver.findElement(By.xpath("//input[starts-with(@id,'use')]")).sendKeys("test123");
		driver.findElement(By.xpath("//input[contains(@name,'dress1')]")).sendKeys("1 kalorama rd");
		driver.findElement(By.xpath("//input[contains(@name,'ci')]")).sendKeys("washington");
		driver.findElement(By.xpath("//input[contains(@name,'ate')]")).sendKeys("dc");
		driver.findElement(By.xpath("//input[starts-with(@name,'postal')]")).sendKeys("20009");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'mail')]")).sendKeys("test123");
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("123");
		driver.findElement(By.xpath("//input[starts-with(@name,'passw')]")).sendKeys("123");
		driver.findElement(By.xpath("//input[contains(@name,'gist')]")).click();
		
		driver.close();
	}
}
