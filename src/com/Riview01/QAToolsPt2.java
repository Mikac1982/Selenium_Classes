package com.Riview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class QAToolsPt2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-form/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String expectedTitle="Demo Form for practicing Selenium Automation";
		if (title.equals(expectedTitle)) {
			System.out.println("You are in the RIGHT location");
			Thread.sleep(1000);
		}else {
			System.out.println("You are in the WRONG location");
		}
		
		driver.findElement(By.name("firstname")).sendKeys("FirstName");
		
		//to get all the links, give us List of Web elements-list of links
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	    System.out.println("Total number of links: "+links.size());
	    
	    int count=0;
	    for(WebElement link:links) {
	    	String linkText=link.getText();
	    	if (!linkText.isEmpty()) {
	    	System.out.println(linkText);
	    	count++;
	    }
	    }
	    System.out.println("Total number of links with text: "+count);
		Thread.sleep(1000);
		
		
		driver.quit();
		
	}
}
