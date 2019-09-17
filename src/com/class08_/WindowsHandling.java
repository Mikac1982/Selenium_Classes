package com.class08_;

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
	static String expectedChildOneTitle="Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
	static String expectedChildTwoTitle="New Window";
	static String expectedParentTitle="The Internet";
	
  public static void main(String[] args) throws InterruptedException {
		
	  setUpDriver("chrome", "https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);	
	  
	  //opening parent window; getting unique parent ID number
	  driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
	  String parentId=driver.getWindowHandle();
	  
	  //clicking on the link -> child1 window opens
	  driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
	  //returns Set of String --> all unique IDs of each window
	  Set<String> allWind=driver.getWindowHandles();
	  System.out.println("Number of windows: "+allWind.size());
	  //iterating through Set of IDs
	  Iterator<String> it=allWind.iterator();
	  while(it.hasNext()) {
		  //getting chil1 ID
			String childId=it.next();
			if(!childId.equalsIgnoreCase(parentId)) {
			  //switching to child1 window
			  driver.switchTo().window(childId);
			  Thread.sleep(2000);	
			}
	  }
	        //getting child1 title and verifying it is valid
			String childOneTitle=driver.getTitle();
			System.out.println(childOneTitle);
			if(childOneTitle.equals(expectedChildOneTitle)) {
				System.out.println("Child1 title is displayed");
			}else {
				System.out.println("Child1 title is NOT displayed");
			}
	  driver.close();
	  
	  //switching back to the parent window
	  driver.switchTo().window(parentId);
	  
	  //clicking on the second link--> opens child2 window
	  driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	  Set<String> allWind2=driver.getWindowHandles();
	  System.out.println("Number of windows: "+allWind2.size());
	  it=allWind2.iterator();
	  while(it.hasNext()) {
		  String childTwoId=it.next();
		  if (!childTwoId.equals(parentId)) {
			  driver.switchTo().window(childTwoId);
			  Thread.sleep(2000);	
		  }
	  }
		  String childTwoTitle=driver.getTitle();
		  System.out.println(childTwoTitle);
		  if(childTwoTitle.equals(expectedChildTwoTitle)) {
			  System.out.println("Child2 title is displayed");
		  }else {
			  System.out.println("Child2 title is NOT displayed");
		  }
	  driver.close();
	  
	  driver.switchTo().window(parentId);
	  //getting parent title and verifying it is valid
	  String parentTitle=driver.getTitle();
	  System.out.println(parentTitle);
	  if (parentTitle.equals(expectedParentTitle)) {
		  System.out.println("Parent title is displayed");
	  }else {
		  System.out.println("Parent title is NOT displayed");
	  }
	  
	  Thread.sleep(2000);
	  driver.quit();
	  
	 
		
	}
}
