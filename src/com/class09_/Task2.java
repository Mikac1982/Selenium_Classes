package com.class09_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilis.CommonMethods;

public class Task2 extends CommonMethods{
	//Open chrome browser
	//Go to “https://the-internet.herokuapp.com/”
	//Click on “Click on the “Dynamic Controls” link
	//Select checkbox and click Remove
	//Click on Add button and verify "It's back!" text is displayed
	//Close the browser

	public static void main(String[] args) {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		WebElement chechBox=driver.findElement(By.cssSelector("input[type='checkbox']"));
		if(chechBox.isEnabled()) {
			chechBox.click();
		}
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement add=driver.findElement(By.xpath("//button[text()='Add']"));
		wait.until(ExpectedConditions.visibilityOf(add));
		
		add.click();
		WebElement text=driver.findElement(By.id("message"));
		wait.until(ExpectedConditions.visibilityOf(text));
		
		if (text.isDisplayed()) {
			String text2=text.getText();
			System.out.println("Text is displayed");
		}else {
			System.out.println("text is not displayed");
		}
		driver.quit();
	}
}
