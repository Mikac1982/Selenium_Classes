package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class HoverOver_ extends CommonMethods{
    //  Navigate to https://www.toolsqa.com
    //  Hover over the Tutorial menu
    //  Click on Software Testing Tutorial
    //  Close the browser
	
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.toolsqa.com");	
		
		//dropover menu won't aper 
		//identifying element ->store element in variable
		WebElement tutorial=driver.findElement(By.xpath("//span[text()='Tutorial']"));
		
		//creating object of an Action class,passing driver
		Actions actions=new Actions(driver);
		
		//action --> mouse over an element
		actions.moveToElement(tutorial).perform();
		Thread.sleep(2000);
		
		//identifying element and clicking
		driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
	}
}
