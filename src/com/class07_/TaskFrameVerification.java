package com.class07_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
		Thread.sleep(2000);
		   //switching to the first frame
	//	driver.switchTo().frame("IF1");      // using id
		driver.switchTo().frame("iframe1");  // using name
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		Thread.sleep(2000);
		
		   //going back to webpage so we can switch to other frame
		driver.switchTo().defaultContent();
		
		  //switching to the the second frame
		driver.switchTo().frame("iframe2");
		WebElement interaction=driver.findElement(By.xpath("//h3[text()='Interactions']"));
		if (interaction.isDisplayed()) {
			System.out.println("Element -interaction- is present in the second frame");
			driver.switchTo().defaultContent();
			driver.quit();
		}else {
			System.out.println("Element -interaction- is NOT present in the second frame");
		}
		
		
	}
}
