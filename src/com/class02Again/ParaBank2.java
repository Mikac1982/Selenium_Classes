package com.class02Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();
        //registration
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.findElement(By.id("customer.firstName")).sendKeys("sopar");
        driver.findElement(By.id("customer.lastName")).sendKeys("ali");
        driver.findElement(By.id("customer.address.street")).sendKeys("aydogdu");
        driver.findElement(By.id("customer.address.city")).sendKeys("tekirdag");//name="customer.address.state"
        driver.findElement(By.id("customer.address.state")).sendKeys("marmara bolgesi");//name=
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("1903");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("5414107788");
        driver.findElement(By.id("customer.ssn")).sendKeys("N/A");
        driver.findElement(By.id("customer.username")).sendKeys("PascalNouma77");
        driver.findElement(By.id("customer.password")).sendKeys("1903");
        driver.findElement(By.id("repeatedPassword")).sendKeys("1903");
        
        driver.findElement(By.xpath("//input[@value='Register' and @type='submit']")).click();
        //logout
        driver.findElement(By.xpath("//a[@href ='/parabank/logout.htm']")).click();
        //login with new user
        driver.findElement(By.name("username")).sendKeys("PascalNouma77");
        driver.findElement(By.name("password")).sendKeys("1903");
        driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']")).click();
		
		
		
		
	}
}
