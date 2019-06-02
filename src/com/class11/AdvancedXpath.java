package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;
import com.utilis.CommonMethods;

public class AdvancedXpath extends CommonMethods{
	// Navigate to “https://opensource-demo.orangehrmlive.com/”
	// Login to the application by writing xpath based on “parent and child relation”
  public static void main(String[] args) {
	
	String url="https://opensource-demo.orangehrmlive.com/";
	setUpDriver("chrome", url); 
	 
	 //using parent/child
	sendText(driver.findElement(By.xpath("//div[@id='divUsername']/input")), "Admin");
	sendText(driver.findElement(By.xpath("//div[@id='divPassword']/input")), "admin123");
		
	
	// Navigate to “https://opensource-demo.orangehrmlive.com/”
	// Login to the application by writing xpath based on “following and preceding siblings”
	sendText(driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input")), "Admin");
	sendText(driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")), "admin123");
		 
		//mixed
	sendText(driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input")), "Admin");
	sendText(driver.findElement(By.xpath("//div[@id='divPassword']/input")), "admin123");
		 
	click(driver.findElement(By.cssSelector("input.button")));
		
	driver.quit();
	  
  }
}
