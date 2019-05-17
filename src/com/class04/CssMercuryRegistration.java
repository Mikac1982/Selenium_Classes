package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssMercuryRegistration {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("milena");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("sibalic");
		driver.findElement(By.cssSelector("input[name^='ph']")).sendKeys("222-333-4444");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("sibalic.milena@gmail.com");
		driver.findElement(By.cssSelector("input[name^='add']")).sendKeys("111 kalorama rd");
		driver.findElement(By.cssSelector("input[name$='ity']")).sendKeys("washington");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("dc");
		driver.findElement(By.cssSelector("input[name$='Code']")).sendKeys("20009");
		driver.findElement(By.cssSelector("input#email")).sendKeys("mmmm33333@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1234milena");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("1234milena");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='image']")).click();
		
		
		
	}
}
