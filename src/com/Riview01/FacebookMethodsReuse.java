package com.Riview01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilis.MethodsReuse;

public class FacebookMethodsReuse extends MethodsReuse{

//	public static WebDriver driver;
	
	public static void main(String[] args) {
		
	//	WebElement ele=driver.findElement(By.name("firstname"));
		MethodsReuse.browserSetUp("chrome", "https://facebook.com");
		MethodsReuse.sendKeys(driver.findElement(By.name("firstname")), "Milena Sibalic");
		
	}
	
	
}
