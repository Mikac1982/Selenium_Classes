package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class CalendarDemo extends CommonMethods{
	
	public static void main(String[] args) throws InterruptedException {
		
		String url="https://jqueryui.com/datepicker";
		setUpDriver("chrome", url);
		
		//first store frame element and then switch
		WebElement frame=driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		switchToFrame(frame);
		
		//first we have to click on element that opens calendar
		driver.findElement(By.id("datepicker")).click();
				
	//	driver.findElement(By.id("ui-datepicker-calendar")).click();
		
		String expectedDate="30";
		
		//get all cells
		List<WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement cell:cells) {
			String cellText=cell.getText();
			if(cellText.equals(expectedDate)) {
				cell.click();
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
