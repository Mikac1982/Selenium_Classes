package com.class07;

import org.openqa.selenium.By;

import com.utilis.CommonMethods;

public class TaskFrameVerification extends CommonMethods{
	  //Open chrome browser
	  //Go to “https://www.toolsqa.com/iframe-practice-page/”
	  //Click on “Guest Blogs” link inside first frame
	  //Verify element “Interactions” is present in second frame
	  //Navigate to Home Page
	  //Quit browser
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		boolean inter=driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		if (inter==true) {
			driver.switchTo().defaultContent();
			driver.close();
			
		}
		
		
		
		
	}
}
