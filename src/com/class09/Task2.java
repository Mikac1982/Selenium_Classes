package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilis.CommonMethods;
public class Task2 extends CommonMethods {
	//Open chrome browser
	//Go to “https://the-internet.herokuapp.com/”
	//Click on “Click on the “Dynamic Controls” link
	//Select checkbox and click Remove
	//Click on Add button and verify "It's back!" text is displayed
	//Close the browser
	
    public static void main(String[] args) {
	
	setUpDriver("chrome", "https://the-internet.herokuapp.com/");
	
	driver.findElement(By.linkText("Dynamic Controls")).click();
	
    WebElement checkBox=driver.findElement(By.cssSelector("input[type='checkbox']"));
    if (checkBox.isEnabled()) {
    	checkBox.click();
    }
    driver.findElement(By.xpath("//button[text()='Remove']")).click();
    
    WebElement addButton=driver.findElement(By.xpath("//button[text()='Add']"));
    
    WebDriverWait wait=new WebDriverWait(driver, 30);
    wait.until(ExpectedConditions.visibilityOf(addButton));
    addButton.click();
    
    WebElement element=driver.findElement(By.id("message"));
    wait.until(ExpectedConditions.visibilityOf(element));
    
    if (element.isDisplayed()) {
    	String text=element.getText();
    	System.out.println("Text: "+text+" is displayed");
    }else {
    	System.out.println("Text is NOT displayed");
    }
    
    driver.quit();
    
    }
}
