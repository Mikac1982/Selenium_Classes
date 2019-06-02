package com.GroupHomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class TaskFormsFill extends CommonMethods{
    //go to "http://uitestpractice.com/"
	//click on "Forms" link
	//fill out the entire form
	//close the browser
	public static void main(String[] args) throws InterruptedException {
		
	setUpDriver("chrome", "http://uitestpractice.com/");	
	click(driver.findElement(By.linkText("Form")));	
		
	sendText(driver.findElement(By.cssSelector("input#firstname")), "eric");	
	sendText(driver.findElement(By.cssSelector("input#lastname")), "james");	
	
	//status
	WebElement radio=driver.findElement(By.cssSelector("label.checkbox-inline"));
	
	
	
	
	
	
	
	
	Thread.sleep(2000);
//	driver.quit();
	}
}
