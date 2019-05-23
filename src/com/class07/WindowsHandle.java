package com.class07;

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
		
		//get the title of the parent
		String parent=driver.getTitle();
		//returns ID number of parent window
		String parentId=driver.getWindowHandle();
		System.out.println("Parent title: "+parent);
		System.out.println("Parent ID: "+parentId);
		
		//click on the link to open new window
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		
		//to get ALL ID numbers of all windows
		//returns us Set of String
		Set<String> allWindows=driver.getWindowHandles();
		//iterating through Set of windows
		Iterator<String> it=allWindows.iterator();
		parent=it.next();
		
		//iterate through second id
		String child=it.next();
		//switch to child window
		driver.switchTo().window(child);
		
		//getting title of the child window -validating 
		child=driver.getTitle();
		//getting ID of child window
		String childId=driver.getWindowHandle();
		System.out.println("Child title: "+child);
		System.out.println("Child ID: "+childId);
		
		//switching directly to the parent window
		driver.switchTo().window(parent);
			
		Thread.sleep(2000);
		driver.close(); //closing child window
		
	}
}
