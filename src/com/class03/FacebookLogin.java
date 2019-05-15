package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
   /* Facebook login:
      Open chrome browser
      Go to “https://www.facebook.com/”
      Enter valid username and valid password and click login
      User successfully logged in
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("john.smith@gmail.com");
	Thread.sleep(2000);
    driver.findElement(By.name("pass")).sendKeys("JohnSmith1");
    Thread.sleep(2000);
    driver.findElement(By.partialLinkText("Forgot")).click();
    Thread.sleep(2000);
    driver.navigate().back();
    driver.findElement(By.name("pass")).sendKeys("JohnSmith1");
	driver.findElement(By.id("u_0_2")).click();	//we will not use locators with numbers; it change all the time
		
	//driver.close();	
		
		
		
		
	}
}
