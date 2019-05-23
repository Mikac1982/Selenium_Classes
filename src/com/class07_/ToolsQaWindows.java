package com.class07_;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utilis.CommonMethods;

public class ToolsQaWindows extends CommonMethods{
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		Thread.sleep(1000);
		
		Set<String> allW=driver.getWindowHandles();
		Iterator<String> it=allW.iterator();
		String parentId=it.next();
		String secondId=it.next();
	    String secondT=driver.switchTo().window(secondId).getTitle();
		if (secondT.equals("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro")) {
			System.out.println("Second title is verified");
		}else {
			System.out.println("Second title is NOT verified");
		}
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(1000);
		allW=driver.getWindowHandles();
		Iterator<String> it2=allW.iterator();
		parentId=it2.next();
		String third=it2.next();
		String thirdTitle=driver.switchTo().window(third).getTitle();
		if (thirdTitle.equals("New Window")) {
			System.out.println("Third title is verified");
		}else {
			System.out.println("Third title is NOT verified");
		}
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window(parentId);
		String parentTitle=driver.getTitle();
		if (parentTitle.equals("The Internet")){
			System.out.println("Parent title is verified");
		}else {
			System.out.println("Third title is NOT verified");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}
