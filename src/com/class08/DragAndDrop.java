package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utilis.CommonMethods;

public class DragAndDrop extends CommonMethods{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.jqueryui.com/droppable");	
		
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		//1st frame-store drag location into web element
		WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
		Thread.sleep(1000);
		//2nd frame- store drop location into web element
		WebElement drop=driver.findElement(By.cssSelector("div#droppable"));
		
		Actions actions=new Actions(driver);
		//draging first frame into second frame
		actions.dragAndDrop(drag, drop).perform();
		
        Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
	}

}
