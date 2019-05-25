package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class TaskFrameVerification extends CommonMethods{
	//Open chrome browser
	  //Go to “https://www.toolsqa.com/iframe-practice-page/”
	  //Click on “Git Log” link inside first frame
	  //Verify element “Interactions” is present in second frame
	  //Navigate to Home Page
	  //Quit browser
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		Thread.sleep(2000);
		
		//first we are switching to the frame-using name
		driver.switchTo().frame("iframe1");
		//clicking on the Log In link
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		Thread.sleep(2000);
		//going back to the main window
		driver.switchTo().defaultContent();
		//switching to the second frame
		driver.switchTo().frame("iframe2");
		//verifying that element Interaction is present
		WebElement interaction=driver.findElement(By.xpath("//h3[text()='Interactions']"));
		if (interaction.isDisplayed()) {
			System.out.println("Element -Interaction- is present in the second frame");
		}else {
			System.out.println("Element -Interaction- is NOT present in the second frame");
		}
		//navigate back to home page
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
