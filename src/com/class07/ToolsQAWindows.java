package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utilis.CommonMethods;

public class ToolsQAWindows extends CommonMethods{
	//Open chrome browser
	//Go to “https://the-internet.herokuapp.com/”
	//Click on “Multiple Windows” link
	//Click on “Elemental Selenium”
	//Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
	//Close second window
	//Click on “Click Here” link
	//Verify title if newly open window is “New Window”
	//Close second window
	//Verify title of second window is “The Internet”
	//Quit browser
	//NOTE: Selenium execution could be too fast, please use Thread.sleep
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		Thread.sleep(1000);
		
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> it=allWindows.iterator();
		String parentId=it.next();
		String secondId=it.next();
		String secondTitle=driver.switchTo().window(secondId).getTitle();
	    System.out.println("Second title: "+secondTitle);
		if (secondTitle.equals("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro")) {
			System.out.println("Second title is verified");
		}else {
			System.out.println("Second title is wrong");
		}
		driver.close();
		//going back to parent window
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(1000);
		//getting all unique IDs 
		Set<String> allWind2=driver.getWindowHandles();
		Iterator<String> it2=allWind2.iterator();
		parentId=it2.next();
		String third=it2.next();
		String thirdTitle=driver.switchTo().window(third).getTitle();
		System.out.println("Third title: "+thirdTitle);
		if(thirdTitle.equals("New Window")) {
			System.out.println("Third title is verified");
		}else {
			System.out.println("Third title is wrong");
		}
	//	driver.close();
		driver.switchTo().window(parentId);
		Thread.sleep(1000);
		parentId=driver.getTitle();
		System.out.println("Parent title: "+parentId);
		if (parentId.equals("The Internet")) {
			System.out.println("Parent title is verified");
		}else {
			System.out.println("Parent title is wrong");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
