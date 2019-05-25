package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class Task3_ extends CommonMethods{
	//Ahead to http://uitestpractice.com/Students/Index
		//Click on the Actions
		//Click and hold on 1,2,3,4 boxes
		//Close the browser
	public static void main(String[] args) throws InterruptedException {
		

		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");	
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		WebElement one=driver.findElement(By.xpath("//li[text()='1']"));
		WebElement two=driver.findElement(By.xpath("//li[text()='2']"));
		WebElement three=driver.findElement(By.xpath("//li[text()='3']"));
		WebElement four=driver.findElement(By.xpath("//li[text()='4']"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(one).clickAndHold().moveToElement(two).clickAndHold().moveToElement(three).clickAndHold().moveToElement(four).build().perform();
	//	actions.clickAndHold(one).clickAndHold(two).clickAndHold(three).
		
	//	actions.clickAndHold(one).moveToElement(four).build().perform();
		Thread.sleep(2000);
		
		driver.quit();
	}	
}
