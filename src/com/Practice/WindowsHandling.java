package com.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utilis.CommonMethods;

public class WindowsHandling extends CommonMethods{
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
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		
		
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		Thread.sleep(1000);
		
		Set<String> allWind=driver.getWindowHandles();
		Iterator<String> it=allWind.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		String childTitle=driver.getTitle();
		if(childTitle.equals("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro")) {
			System.out.println("Child title verified");
		}else {
			System.out.println("Child title NOT verified");
		}
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(2000);
		allWind=driver.getWindowHandles();
		it=allWind.iterator();
		parentId=it.next();
		String newId=it.next();
		driver.switchTo().window(newId);
		String newTitle=driver.getTitle();
		if(newTitle.equals("New Window")){
			System.out.println("New title verified");
		}else {
			System.out.println("New title NOT verified"); 
		}
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(parentId);
		String parentTitle=driver.getTitle();
		if (parentTitle.equals("The Internet")) {
			System.out.println("Parent title verified");
		}else {
			System.out.println("Parent title NOT verified");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
