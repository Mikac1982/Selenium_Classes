package com.class07_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class iFrame extends CommonMethods{
    //go to this Webpage, switch to the frame and enter some text
	
	public static void main(String[] args) throws InterruptedException {
		

		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		
		//we can Not send keys because this element is inside a FRAME
		//we will get NoSuchElementException: no such element: Unable to locate element
		//in order to do any action(sendKeys), first we have to SWITCH to that frame:
		
		//WAY 1: using NAME 
//		driver.switchTo().frame("iframe_a"); //first we have to switch to the frame
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input#name")).sendKeys("Milena"); //now we can perform an action
		
		//WAY 2: using WebElement 
		//first we identify element
		WebElement element=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		//then we are switching and passing that element in frame()
		driver.switchTo().frame(element);  //overloading
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("Milena");
		
		//WAY 3: using INDEX
//		driver.switchTo().frame(0);  //overloading
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input#name")).sendKeys("Milena");
		
		//going Back from frame to the Web page!
		//we have to exit frame in order to do any actions to the web page/main window
		driver.switchTo().defaultContent(); 
		
		Thread.sleep(2000);
		driver.close();
	}
}
