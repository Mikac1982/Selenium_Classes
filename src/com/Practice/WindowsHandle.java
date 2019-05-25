package com.Practice;

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
		
		String parent=driver.getTitle();
		String parentId=driver.getWindowHandle();
		System.out.println("Parent: "+parent+" "+parentId);
		
		//click on the link to open new tab
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		
	
		Set<String> allWindows=driver.getWindowHandles();
		//iterate through each unique id
		Iterator<String> it=allWindows.iterator();
		parent=it.next();  //goes to first id
		String child=it.next();  //goes to child id
		//in order for us to use secondId we have to switch to child window
		driver.switchTo().window(child);
		child=driver.getTitle();
		String childId=driver.getWindowHandle();
		System.out.println("Child:  "+child+" "+childId);
		
		Thread.sleep(2000);
		driver.close();
	//	driver.close();  //closing child window
	//	driver.switchTo().window(parent);  //switching to parent window
		
	}
}
