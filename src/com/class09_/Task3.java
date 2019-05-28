package com.class09_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilis.CommonMethods;

public class Task3 extends CommonMethods{
	//Open chrome browser
	//Go to “https://the-internet.herokuapp.com/”
	//Click on “Click on the “Dynamic Controls” link
	//Click on enable button
	//Enter "Hello" and verify text is entered successfully 
	//Close the browser
	
	public static void main(String[] args) throws InterruptedException {
		
	setUpDriver("chrome", "https://the-internet.herokuapp.com/");	
	
	String text="Dynamic Controls";
	driver.findElement(By.linkText(text)).click();	
	
	String buttonXpath="//button[text()='Enable']";
	driver.findElement(By.xpath(buttonXpath)).click();	
	
	     //1. way: passing locator directly into ExpectedConditions
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Disable']")));
	
	String textToEnter="Hello";
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textToEnter);
	
	String returnedText=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
	if (returnedText.equals(textToEnter)) {
		System.out.println("Text "+returnedText+" is entered");
	}else {
		System.out.println("Text is not entered");
	}
	
	     //2. way: identify element and then pass it to the ExpectedConditions
//	WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
	
//	WebDriverWait wait=new WebDriverWait(driver,30);
//	wait.until(ExpectedConditions.elementToBeClickable(element));
	
//	String textToEnter="Hello";
//	element.sendKeys(textToEnter);
	
	//verifying text is entered successfully
//	String value=element.getAttribute("value");
//	System.out.println(value);  //Hello
	
	
	Thread.sleep(2000);
	driver.quit();
	}
}
