package com.class07_;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utilis.CommonMethods;

public class WindowsHandle extends CommonMethods{
	//Ahead to http://uitestpractice.com/Students/Switchto
		//	Get the parent title
		//	Get the parentId
		//	print the parent title and parentId
		//	Click on the open in a new window
		//	Get the child title
		//	Get the childId
		//	print the child title and childId
		//	close the child window
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		
		//first we want to get title of the window
		String parent=driver.getTitle();
		
		//getWindowHandle(); --> returns String = unique id of that window
		String parentId=driver.getWindowHandle();
		System.out.println("Parent title: "+parent+" ID: "+parentId);
		
		//clicking on the link that opens new window
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		
		//getWindowHandles(); --> to get all unique IDs of opened windows
		//returns us Set of Strings
		Set<String> allWindows=driver.getWindowHandles();
		   //to get all the windows titles
		Iterator<String> it=allWindows.iterator();
		parent=it.next();  //iterate first id
		
		//iterate through second id
		String child=it.next(); 
		//switch to child window
		driver.switchTo().window(child);
		
		//getting title of the child window -validating 
		child=driver.getTitle();
		
		//getting ID of child window
		String childId=driver.getWindowHandle();
		System.out.println("Child title : "+child+" ID: "+childId);
	
		//switching directly to the parent window
		driver.switchTo().window(parent);
	
		
		Thread.sleep(2000);
		driver.close(); //closing child window
	}
}
