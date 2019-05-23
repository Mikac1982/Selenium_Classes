package com.class03_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		/* Facebook login:
	      Open chrome browser
	      Go to “https://www.facebook.com/”
	      Enter valid username and valid password and click login
	      User successfully logged in
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		     //returns only 1 element!
		driver.findElement(By.id("email")).sendKeys("sibalic.milena@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("johnsmith1");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		//we should use locators that pass numbers, it's risk..values are changing all the time
		driver.findElement(By.id("u_0_2")).click();
		
		
		
	}
}
