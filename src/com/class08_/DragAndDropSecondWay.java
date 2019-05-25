package com.class08_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class DragAndDropSecondWay extends CommonMethods{
	//Ahead to http://uitestpractice.com/Students/Index
	//Click on the Actions
	//Handle the drag and drop
	//Close the browser
	public static void main(String[] args) throws InterruptedException {
		
       setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		Thread.sleep(2000);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
	//	action.clickAndHold(drag).perform();
	//	action.moveToElement(drop).perform();
	//	action.release(drop);
		      //or in one line:
		action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}
}
