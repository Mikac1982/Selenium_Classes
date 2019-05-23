package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class FrameTask extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");	
		
		//1at way--> using NAME
	//	driver.switchTo().frame("iframe_a");
		
		//2 way--> WEB ELEMENT
		
//		WebElement element=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
//		driver.switchTo().frame(element);
		    //or we can do this way -->without storing element inside the variable
	//    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='iframe_a']")));
		//3 way--> INDEX
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("milena");
		driver.switchTo().defaultContent();
		
		
		
	} 
}
