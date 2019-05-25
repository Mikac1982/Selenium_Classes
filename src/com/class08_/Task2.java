package com.class08_;

import javax.swing.Action;

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
		Thread.sleep(2000);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver); 
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		
		driver.quit();
	}
}
