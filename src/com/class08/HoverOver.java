package com.class08;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class HoverOver extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {

		setUpDriver("chrome", "https://www.toolsqa.com");	
		WebElement hoverOver=driver.findElement(By.xpath("//span[text()='DEMO SITES']"));
		Actions actions=new Actions(driver);	
		actions.moveToElement(hoverOver).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Automation Practice Switch Windows']")).click();
		
		Thread.sleep(2000);
	//	driver.close();
	}
}
