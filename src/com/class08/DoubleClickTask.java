package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class DoubleClickTask extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.saucedemo.com");	
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("pass");
		Actions actions=new Actions(driver);
//		actions.doubleClick(driver.findElement(By.cssSelector("input#password"))).perform();
		WebElement element=driver.findElement(By.cssSelector("input#password"));
	    actions.doubleClick(element).perform();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
