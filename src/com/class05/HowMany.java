package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowMany {

	public static void main(String[] args) {
		//go to ebay and capture all links and get number of links and
		//print ONLY links that have text
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.ebay.com");
		
		//tagName returns you list of web elements
		List<WebElement> links=driver.findElements(By.tagName("a"));   //a- for links
	//	List<WebElement> links=driver.findElements(By.tagName("img")); //img -for images
		System.out.println("Total number of links: "+links.size()); //407Total number of links: 407
		
		//to get number of lnks with text
		int count=0;
		
		for (WebElement link:links) {
			String linkText=link.getText();
			if (!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
			}
		}
		System.out.println("Total number of links with text: "+count); //Total number of links with text: 134
		
		
		
		driver.quit();
		
		
	}
}
