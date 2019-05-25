package com.class08_;

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
		
		WebElement tutorial=driver.findElement(By.xpath("//span[text()='Tutorial']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(tutorial).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
