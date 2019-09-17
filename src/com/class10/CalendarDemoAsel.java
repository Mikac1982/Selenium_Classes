package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class CalendarDemoAsel extends CommonMethods{
	
	public static void main(String[] args) throws InterruptedException {
		
		String url="https://jqueryui.com/datepicker/";
		setUpDriver("chrome", url);
		
		//store frame element and then switch
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		switchToFrame(frame);
		
		//1. click on the element that open calendar view
		driver.findElement(By.id("datepicker")).click();
		
		String expectedDate="30";
		
		//2. get all cells
		List <WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		//3. loop to get text of each cell
		for (WebElement cell: cells) {
			//get text of each cell
			String cellText=cell.getText();
		//4.checking specific date
			if (cellText.equals(expectedDate)) {
	    //5.if date is matching, click on it
				cell.click();
			}
		}
		Thread.sleep(7000);
		driver.quit();
		

	}

}
