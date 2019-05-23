package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class Task1 extends CommonMethods{
	//Open chrome browser
	//Go to “https://www.toolsqa.com/iframe-practice-page/”
	//Click on “Guest Blogs” link inside first frame
	//Verify element “Interactions” is present in second frame
	//Navigate to Home Page
    //Quit browser
	
	public static void main(String[] args) throws InterruptedException {
		
	       CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page");
	        Thread.sleep(2000);
	        driver.switchTo().frame("iframe1");
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Blogs")).click();
	        driver.switchTo().defaultContent();
	        driver.switchTo().frame("iframe2");
	        Thread.sleep(2000);
	        WebElement title = driver.findElement(By.xpath("//h3[text()='Interactions']"));
	        System.out.println("The title is: "+title.getText());
	                boolean isDisplayed=title.isDisplayed();
	                System.out.println(isDisplayed);
	                Thread.sleep(2000);
	        driver.switchTo().defaultContent();
	        driver.quit();
	        
		
		
		
		
	}
}
