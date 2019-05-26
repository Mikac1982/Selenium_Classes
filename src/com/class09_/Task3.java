package com.class09_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	public static void main(String[] args) {
		
	setUpDriver("chrome", "https://the-internet.herokuapp.com/");	
		
	driver.findElement(By.linkText("Dynamic Controls")).click();	
	driver.findElement(By.xpath("//button[text()='Enable']")).click();	
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement disable=driver.findElement(By.xpath("//button[text()='Disable']"));
	wait.until(ExpectedConditions.visibilityOf(disable));
	
	Actions action=new Actions(driver);
	WebElement box=driver.findElement(By.cssSelector("input[type='text']"));
	action.moveToElement(box).click().sendKeys("Hello").build().perform();
	
	disable.click();
	WebElement text=driver.findElement(By.id("message"));
	wait.until(ExpectedConditions.visibilityOf(text));
	
	if (text.isDisplayed()) {
		String message=text.getText();
		System.out.println("Text is entered succsesfully");
	}else {
		System.out.println("Text is NOT entered succsesfully");
	}
	
	
	}
}
