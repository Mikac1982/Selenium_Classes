package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class DoubleClick extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.saucedemo.com");	
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("double");
		
		Actions actions=new Actions(driver);
		actions.doubleClick(driver.findElement(By.cssSelector("input#user-name"))).perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
