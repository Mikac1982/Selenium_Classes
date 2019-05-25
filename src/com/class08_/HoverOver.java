package com.class08_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class HoverOver extends CommonMethods{

	public static void main(String[] args) {
		
		setUpDriver("chrome", "https://www.toolsqa.com");
        
		//dropover menu wont aper, we have to hover over 
		//identify the element ->store it in a variable
		WebElement hoverOver=driver.findElement(By.xpath("//span[text()='DEMO SITES']"));
		
		//creating object of Actions Class, passing driver
		Actions action=new Actions(driver);
		
		//action -->mouse over the element
		action.moveToElement(hoverOver).perform();
		
		//click on Automation Practice Form
		driver.findElement(By.xpath("//span[text()='Automation Practice Form']")).click();
		
	}
}
