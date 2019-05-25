package com.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class Task1 extends CommonMethods{  //Halime T.
	//Ahead to http://uitestpractice.com/Students/Index
	//	Click on the Actions
	//	Click on the click me !
	//	Handle the alert and click okay
	//	Double Click Double Click Me !
	//	Handle the alert and click okay
	//	Close the browser
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://uitestpractice.com/Students/Actions");
		
		 Actions action=new Actions(driver);
		 
		 action.moveToElement(driver.findElement(By.name("dblClick"))).doubleClick().build().perform();
	     Thread.sleep(3000);
	     Alert alert=driver.switchTo().alert();
	     alert.accept();
	        
	     Thread.sleep(3000);
	        
	     action.moveToElement(driver.findElement(By.xpath("//button[text()='Click Me !']"))).click().build().perform();
	     Thread.sleep(3000);
	     alert=driver.switchTo().alert();
	     alert.accept();
	        
	     Thread.sleep(3000);
	     WebElement source=driver.findElement(By.cssSelector("#draggable"));
	     WebElement target=driver.findElement(By.id("droppable"));
	     action.dragAndDrop(source, target).build().perform();
	     Thread.sleep(3000);
	        
	//    driver.close();
		
		
	}
}
