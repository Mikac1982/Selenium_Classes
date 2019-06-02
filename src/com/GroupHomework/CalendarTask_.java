package com.GroupHomework;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class CalendarTask_ extends CommonMethods{
    //go to "https://jqueryui.com/"
	//click on "Datepicker"
	//select August 10 of 2019
	//verify date "08/10/2019 has been entered successfully 
	//close browser
	
	public static void main(String[] args) throws InterruptedException {
		
	String url="https://jqueryui.com/";
	setUpDriver("chrome", url);	
	
	click(driver.findElement(By.linkText("Datepicker")));	
	switchToFrame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));	
	click(driver.findElement(By.id("datepicker")));	
		
	String xpath="//span[@class='ui-datepicker-month']";	
	String month=driver.findElement(By.xpath(xpath)).getText();
	
	String expectedMonth="August";
	String wantedDate="10";

	if(!month.equals(expectedMonth)) {
		do {
			click(driver.findElement(By.xpath("//span[text()='Next']")));
		}
		while(!driver.findElement(By.xpath(xpath)).getText().equals(expectedMonth));
	}
	
	List<WebElement> cells=driver.findElements(By.xpath("//table[contains(@class,'calendar')]/tbody/tr/td"));
	for(WebElement cell:cells)	{
		String cellText=cell.getText();
		
		if (cellText.equals(wantedDate)) {
			cell.click();
		}
	}
	
	WebElement ele=driver.findElement(By.cssSelector("input#datepicker"));
	String date=ele.getAttribute("value");
	String expectedDate="08/10/2019";
	if (date.equals(expectedDate)) {
		System.out.println("The date "+date+" is successfully entered");
	}else {
		System.out.println("The date "+date+" is NOT successfully entered");
	}
	
	Thread.sleep(4000);
	driver.quit();
	}
}
