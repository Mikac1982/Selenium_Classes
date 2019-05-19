package com.class05Again;

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
		
	//	driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com");
		
		//to capture all links-we have to specify tag -->a
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+links.size());
	
		int count=0;
		
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext()) {
			String linkTxt=it.next().getText(); //to get links with text
			if (!linkTxt.isEmpty()) {
				System.out.println(linkTxt);
				count++;
			}
		}
		System.out.println("Total number of links with text: "+count);
		
		
		
		
	//	for (WebElement link:links) {
	//		String linkTxt=link.getText();
	//		if (!linkTxt.isEmpty()) {
	//			System.out.println(linkTxt);
	//			count++;
	//		}
	//	}
		
		
		
		
		
		
		
		
		driver.quit();
		
	}
}
