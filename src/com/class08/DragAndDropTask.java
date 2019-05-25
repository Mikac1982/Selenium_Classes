package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class DragAndDropTask extends CommonMethods{
    //handle the frame
	//drag and drop
	//close browser
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.jqueryui.com/droppable");		
		
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		
		WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Thread.sleep(1000);
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
