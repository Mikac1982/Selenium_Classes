package com.class11_;

import org.openqa.selenium.By;

import com.utilis.CommonMethods;

public class TaskOne extends CommonMethods{
	// Navigate to “https://opensource-demo.orangehrmlive.com/”
	// Login to the application by writing xpath based on “parent and child relation
	
	public static void main(String[] args) {
		
		String url="https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chrome", url); 	
		
		//parent to child
//		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
//		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("admin123");
	
//		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		
		//siblings
		driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input")).sendKeys("Admin");
		driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("admin123");
		
		
		
        driver.quit();
	}
}
