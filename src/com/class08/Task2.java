package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class Task2 extends CommonMethods{
    //Ahead to http://uitestpractice.com/Students/Index
	//Click on the Actions
	//Handle the drag and drop
	//Close the browser
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");	
		
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions actions=new Actions(driver);
	//	actions.dragAndDrop(drag, drop).perform();
		//second way of drag/drop
		actions.clickAndHold(drag).moveToElement(drop).release(drag).perform();
		Thread.sleep(2000);
		
		
		
	} 
}
