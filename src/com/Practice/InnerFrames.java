package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class InnerFrames extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_frame_mix");
		Thread.sleep(2000);
		
		//not working
	//	WebElement frameEl=driver.findElement(By.xpath("//h3[text()='Frame A']"));
	//	driver.switchTo().frame(frameEl);
	//	Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		
		driver.switchTo().defaultContent();
		
		
		
		
		driver.quit();
		
		
	}
}
