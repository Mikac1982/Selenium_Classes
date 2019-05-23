package com.class07_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class iFrameAgain extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		
		   //1. using name
	//	driver.switchTo().frame("iframe_a");
	//	Thread.sleep(2000);
	//	driver.findElement(By.id("name")).sendKeys("Mika");
		
		  //2. using WebElement 
		
		WebElement element=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(element);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mika");
		    //to verify if SwitchTo is displayed:
		//first we have to switch back to Webpage!
		driver.switchTo().defaultContent();
		WebElement switchTo=driver.findElement(By.xpath("//h2[text()='SwitchTo']"));
		if (switchTo.isDisplayed()) {
			System.out.println("true");
			Thread.sleep(2000);
			driver.close();
		}else {
			System.out.println("false");
		}
		
		  //3. using index
		
		driver.switchTo().frame(0);
		driver.close();
		
		
	}
}
