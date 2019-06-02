package com.GroupHomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class CalendarTask extends CommonMethods{
	//go to "https://jqueryui.com/"
	//click on "Datepicker"
	//select August 10 of 2019
	//verify date "08/10/2019 has been entered successfully 
	//close browser
	
	public static void main(String[] args) throws InterruptedException {
		
		String url="https://jqueryui.com/";
		
		setUpDriver("chrome", url);
		click(driver.findElement(By.linkText("Datepicker")));
		switchToFrame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		click(driver.findElement(By.cssSelector("input#datepicker")));
		
		String xpath="//span[@class='ui-datepicker-month']";
		String month=driver.findElement(By.xpath(xpath)).getText();
		
	//	String monthText=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		String expectedMonth="August";
		if(!month.equals(expectedMonth)) {
			do {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			while(!driver.findElement(By.xpath(xpath)).getText().equals(expectedMonth));
		}
		
		List<WebElement> cells=driver.findElements(By.xpath("//table[contains(@class,'calendar')]/tbody/tr/td"));
		for(WebElement cell:cells) {
			String cellText=cell.getText();
			if (cellText.equals("10")) {
				cell.click();
			}
		}
		
		String selected="08/10/2019";
		String date=driver.findElement(By.cssSelector("input#datepicker")).getAttribute("value");
		
		if(selected.equals(date)) {
			System.out.println("Date "+selected+" was entered successfully");
		}else {
			System.out.println("Date "+selected+" was NOT entered successfully");
		}
		
		Thread.sleep(3000);
		driver.quit();
				
	}
}
