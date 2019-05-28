package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilis.CommonMethods;

public class WebDriverDemo_ExplicitWait extends CommonMethods{

	public static void main(String[] args) {
		
		String url="http://uitestpractice.com";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("AjaxCall")).click();
		driver.findElement(By.linkText("This is a Ajax link")).click();
		
		//before we perform any action, we bring WebDriver and wait additional 30sec until (element becomes visible)
		//every time there is slow element, we need to bring WebDriverWait class
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		//applicable only for this specific element , nothing else
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.ContactUs")));
		
		//this element might takes more time
		WebElement el=driver.findElement(By.cssSelector("div.ContactUs"));
		
		if (el.isDisplayed()){
			String text=el.getText();
			System.out.println(text);
		}else {
			System.out.println("Element is NOT displayed");
		}
			
		driver.quit();
	
		
	}
}
