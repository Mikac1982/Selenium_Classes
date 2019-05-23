package com.class02_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		
		driver.findElement(By.id("customer.firstName")).sendKeys("Milena");
		driver.findElement(By.id("customer.lastName")).sendKeys("Sibalic");
		driver.findElement(By.id("customer.address.street")).sendKeys("1884 columbia rd");
		driver.findElement(By.id("customer.address.city")).sendKeys("Washington");
		driver.findElement(By.id("customer.address.state")).sendKeys("DC");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("20009");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("202-333-5555");
		driver.findElement(By.id("customer.ssn")).sendKeys("111-222-3333");
		driver.findElement(By.id("customer.username")).sendKeys("Mika1982");
		driver.findElement(By.id("customer.password")).sendKeys("mika11111");
		driver.findElement(By.id("repeatedPassword")).sendKeys("mika11111");
		driver.findElement(By.className("class")).click();
		
		driver.close();
		
		
	}
}
