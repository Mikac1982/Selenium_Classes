package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class RightClick extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.saucedemo.com");	
		//storing web element
		WebElement rightClick=driver.findElement(By.cssSelector("input#user-name"));
		Actions actions=new Actions(driver);
		//doing right click on the web element and perform
		actions.contextClick(rightClick).perform();
		Thread.sleep(2000);
		
		
		
		
	}
}
