package com.class08_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class Task3 extends CommonMethods{
	//Ahead to http://uitestpractice.com/Students/Index
	//	Click on the Actions
	//	Click and hold on 1,2,3,4 boxes
	//	Close the browser
	
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		Thread.sleep(2000);
		
		WebElement one=driver.findElement(By.xpath("//li[text()='1']"));
		WebElement two=driver.findElement(By.xpath("//li[text()='2']"));
		WebElement three=driver.findElement(By.xpath("//li[text()='3']"));
		WebElement four=driver.findElement(By.xpath("//li[text()='4']"));
		Actions action=new Actions(driver);
		action.moveToElement(one).clickAndHold().moveToElement(two).clickAndHold().moveToElement(three).clickAndHold().moveToElement(four).build().perform();
		
		//this way works as well
		action.clickAndHold(one).clickAndHold(two).clickAndHold(three).clickAndHold(four).build().perform();
	
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
