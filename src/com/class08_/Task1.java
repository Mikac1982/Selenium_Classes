package com.class08_;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class Task1 extends CommonMethods{
	// Ahead to http://uitestpractice.com/Students/Index
	//  Click on the Actions
	//  Click on the click me 
	//	Handle the alert and click okay
	//	Double Click Double Click Me !
	//	Handle the alert and click okay
	//	Close the browser
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");	
		
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click Me !']")).click();
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		WebElement doubleClick=driver.findElement(By.xpath("//button[text()='Double Click Me !']"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleClick).perform();
		Thread.sleep(2000);
		
		alert=driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
