package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkCount {
	//Open chrome browser
	//Go to “https://www.amazon.com/”
	//Using Iterator get text of each link
	//Get number of links that has text
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com");
		
		//capture all links -->findElements
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+links.size());
		
		int count=0;
		Iterator<WebElement> linksIt=links.iterator();
		while (linksIt.hasNext()) {
			String linkText=linksIt.next().getText();
			if(!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
			}	
		}
		System.out.println("Total number of links that have text: "+count);
		
		driver.quit();
		
	}
}
