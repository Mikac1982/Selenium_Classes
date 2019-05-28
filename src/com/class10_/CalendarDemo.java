package com.class10_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class CalendarDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://jqueryui.com/datepicker";
		setUpDriver("chrome", url);
		
		//first store frame element and then switch to frame
		WebElement frame=driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
	//	driver.switchTo().frame(frame);
		switchToFrame(frame);
		
		//1. we have to click on element that opens calendar (click to see calendar view)
		driver.findElement(By.id("datepicker")).click();
		
		//2. get all cells -->/td of the table using findElements()
		List<WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		//3.get text of each cell/td
		String expectedDate="30";
		
		for (WebElement cell:cells) {
			String cellText=cell.getText();
			if(cellText.equals(expectedDate)){
				cell.click();
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
