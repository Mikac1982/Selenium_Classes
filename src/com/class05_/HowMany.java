package com.class05_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowMany {
	//go to ebay and capture all links and get number of links and
	//print ONLY links that have text -text can not be empty
	public static void main(String[] args) {
		                         //finding the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().fullscreen();
		driver.get("http://www.ebay.com");
		
		//links return list of web elements; By.tagName -a -->find all links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+links.size());
		
		int count=0;
		
		for (WebElement link:links) {
			String linkTxt=link.getText();
			if(!linkTxt.isEmpty()) {
				System.out.println(linkTxt);
				count++;
			}
		}
		System.out.println("Total number of links with text: "+count);
		
		driver.quit();
		
	}
}
