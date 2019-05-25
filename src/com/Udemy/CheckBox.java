package com.Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class CheckBox extends CommonMethods{
   //Navigate to Below URL:
   //http://qaclickacademy.com/practice.php
   //Check the first  Checkbox and verify if it is successfully checked
   //and Uncheck it again to verify if it is successfully Uncheck
   //How to get the Count of number of check boxes present in the page
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "http://qaclickacademy.com/practice.php");	
		Thread.sleep(2000);
		
		List<WebElement> opt=driver.findElements(By.name("checkBoxOption1"));
		System.out.println("number of chech boxes on the page: "+opt.size());
		for (WebElement options:opt) {
			if (options.isEnabled()) {
				options.click();
				Thread.sleep(2000);
				options.click();
				
			}
		}
		
		
		
		driver.quit();
		
	}
}
