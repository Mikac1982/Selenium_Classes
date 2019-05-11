package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) throws InterruptedException{
		//opening chrome driver
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		
		driver.findElement(By.id("customer.firstName")).sendKeys("bob");
		Thread.sleep(1000);
		driver.findElement(By.name("customer.lastName")).sendKeys("tom");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.address.street")).sendKeys("123 street");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.address.city")).sendKeys("Washington");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.address.state")).sendKeys("DC");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("20009");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("4445355366");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.ssn")).sendKeys("101-202-3333");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.username")).sendKeys("mika1222");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.password")).sendKeys("303yes");
		Thread.sleep(1000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("303yes");
		Thread.sleep(1000);
		driver.findElement(By.className("button"));
		Thread.sleep(1000);
		
	//	driver.close();
		
	}
}
