package com.class10_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilis.CommonMethods;

public class Task3class09 extends CommonMethods{
	//Open chrome browser
	//Go to “https://the-internet.herokuapp.com/”
	//Click on “Click on the “Dynamic Controls” link
	//Click on enable button
	//Enter "Hello" and verify text is entered successfully 
	//Close the browser
	
	public static void main(String[] args) throws InterruptedException {
		
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
		//2 way: first identify element and then pass it to the ExpectedConditions
		WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		String textToEnter="Hello";
		element.sendKeys(textToEnter);
		//or in 1 line-->  element.sendKeys("Hello");
		
		//verifying text is entered successfully
		String value=element.getAttribute("value");
		System.out.println(value);  //Hello
		
		Thread.sleep(3000);
		driver.quit();
	}
}
