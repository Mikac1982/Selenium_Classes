package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeLogin {
	//Open chrome browser
	//Go to “https://www.saucedemo.com/”
	//Enter invalid username and password and click login
	//Verify error message contains: “Username and password do not match any user in this service”
	
	public static void main(String[] args) throws InterruptedException {
		
		String userName="standard_user";
		String password="secret_sauce";
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		//login to application
		driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//login verification
		
		WebElement errorTxt=driver.findElement(By.xpath("//h3[@data-test='error']"));
		String value=errorTxt.getText();
		System.out.println(value);
		
		String expectedTxt="Epic sadface: Username and password do not match any user in this service";
		if (value.equals(expectedTxt)) {
			System.out.println("Expected error massage is displayed");
		}else {
			System.out.println("Expected error massage is NOT displayed");
		}
		
		driver.close();
	}
}
