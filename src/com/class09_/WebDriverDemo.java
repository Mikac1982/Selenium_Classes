package com.class09_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilis.CommonMethods;

public class WebDriverDemo extends CommonMethods{

	public static void main(String[] args) {
		
		String url="http://uitestpractice.com";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("AjaxCall")).click();
		driver.findElement(By.linkText("This is a Ajax link")).click();
		
		//as parameters we pass driver and time out we want
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.ContactUs")));
		
		//before this element aper (we know it takes more time), we have to bring WebDriverWait
		WebElement el=driver.findElement(By.cssSelector("div.ContactUs"));
		
		if (el.isDisplayed()) {
			String text=el.getText();
			System.out.println(text);
		}else {
			System.out.println("Element is NOT displayed");
		}
		
		driver.quit();
	}
}
