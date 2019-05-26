package com.class09_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilis.CommonMethods;
public class Task1 extends CommonMethods{
	//Open chrome browser
	//Go to “https://the-internet.herokuapp.com/”
	//Click on “Click on the “Dynamic Loading” link
	//Click on “Example 1...” and click on “Start”
	//Verify element with text “Hello World!” is displayed
	//Close the browser
	
	public static void main(String[] args) {
		
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
	
		WebElement element=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(element));
		
		if (element.isDisplayed()) {
			String text=element.getText();
			System.out.println("Element with text "+text+" is displayed");
		}else {
			System.out.println("Element is NOT displayed");
		}
		
		driver.quit();
		
	}
}
