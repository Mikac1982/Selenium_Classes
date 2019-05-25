package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class RightClickTask extends CommonMethods{
	// Task for contextClick
    // Navigate to https://www.saucedemo.com
    // Right click on the password textbox 
    // Close the browser 
	
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.saucedemo.com");	
		
		WebElement rightClick= driver.findElement(By.cssSelector("input#password"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightClick).perform();
		Thread.sleep(2000);
		
	}
}
