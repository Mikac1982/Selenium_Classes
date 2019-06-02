package com.class09_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class DropDownTest extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://www.toolsqa.com/automation-practice-form/";
		
		setUpDriver("chrome", url);
		WebElement contriesDD=driver.findElement(By.cssSelector("select#continents"));
		
		selectValueDropDown(contriesDD, "Australia");
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
