package com.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class Task4 extends CommonMethods{
 
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://demo.guru99.com/test/simple_context_menu.html");		
		
		  //double click
		Actions action=new Actions(driver);
		
	 // action.moveToElement(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).doubleClick().perform();
		WebElement doubleClic=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(doubleClic).perform();
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	      //right click
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));	
		action.contextClick(rightClick).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
