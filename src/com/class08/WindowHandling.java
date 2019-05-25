package com.class08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utilis.CommonMethods;

public class WindowHandling extends CommonMethods{

	static String url="https://the-internet.herokuapp.com/";
	static String expectedFirstChildTitle="Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
	static String expectedSecondChildTitle="New Window";
	static String expectedParentTitle="The Internet";
	
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", url);	
		//getting to the parent window
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		String parentId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		Set<String> handle=driver.getWindowHandles();
		System.out.println(handle.size()); //how many windows opened
		Iterator<String> it=handle.iterator();
		while(it.hasNext()) {
			String childOneId=it.next();
			if(!childOneId.equals(parentId)) {
				driver.switchTo().window(childOneId);
				Thread.sleep(2000);
			}
		}
			String actualChildOneTitle=driver.getTitle();
			if (actualChildOneTitle.equalsIgnoreCase(expectedFirstChildTitle)) {
					System.out.println("Title is displayed");
			}else {
					System.out.println("Title is NOT displayed");
			
		}
		driver.close();
		driver.switchTo().window(parentId);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		handle=driver.getWindowHandles();
		it=handle.iterator();
		while(it.hasNext()) {
			String childTwoId=it.next();
			if(!childTwoId.equalsIgnoreCase(parentId)) {
				driver.switchTo().window(childTwoId);
				Thread.sleep(2000);
			}
		}
			String actualChildTwoTitle=driver.getTitle();
			if(actualChildTwoTitle.equalsIgnoreCase(expectedSecondChildTitle)) {
				System.out.println("Title is displayed");
			}else {
				System.out.println("Title is NOT displayed");
			
		}
		driver.close();
		driver.switchTo().window(parentId);
		
		String actualParentTitle=driver.getTitle();
		if (actualParentTitle.equalsIgnoreCase(expectedParentTitle)) {
			System.out.println("Title is displayed");
		}else {
			System.out.println("Title is NOT displayed");
		}
		driver.close();
		
	}
}
