package com.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.spicejet.com/");
		
	//	driver.findElement(By.cssSelector("a[value='MAA']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(2000);
		
	//	driver.findElement(By.cssSelector("a[value='MAA']")).click(); //ElementNotVisibleException
		
	//	(//a[@value='MAA'])[2] --> wrapping to get second matching element, to handle DYNAMIC drop down
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		Thread.sleep(4000);
		driver.quit();
	}
}
