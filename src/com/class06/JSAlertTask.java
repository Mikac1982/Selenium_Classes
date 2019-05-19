package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertTask {
	//Open chrome browser
	//Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
	//Verify
	//alert box with text “I am an alert box!” is present
	//confirm box with text “Press a button!” is present
	//prompt box with text “Please enter your name” is present
	//Quit browser
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		
		Thread.sleep(2000);
	//	driver.quit();
		
	}
}
