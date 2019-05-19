package com.class04Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssMercuryRegistration {
	//Mercury Tours Registration:
	//	Open chrome browser
	//	Go to “http://newtours.demoaut.com/”
	//	Click on Register Link
	//	Fill out all required info
	//	Click Submit
	//	User successfully registered
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("milena");
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys("sibalic");
		driver.findElement(By.cssSelector("input[name*='hone']")).sendKeys("202-333-4455");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("milena12@gmail.com");
		driver.findElement(By.cssSelector("input[name$='ress1']")).sendKeys("123 kalorama rd");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("washington");
		driver.findElement(By.cssSelector("input[name*='stat']")).sendKeys("DC");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("20009");
		driver.findElement(By.cssSelector("input#email")).sendKeys("milena123");
		driver.findElement(By.cssSelector("input[name^='passw']")).sendKeys("999");
		driver.findElement(By.cssSelector("input[name$='Password']")).sendKeys("999");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='register']")).click();
		
	//	driver.getTitle();
		
	//	driver.getCurrentUrl();
	}
}
