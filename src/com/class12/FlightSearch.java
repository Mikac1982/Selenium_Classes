package com.class12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilis.CommonMethods;

public class FlightSearch extends CommonMethods{
   /* TC 12356 - search flight verification
    * Step 1: navigate to URL
    * Step 2: enter details
    * Step 3: verify search is successful
    */
	
	String browser="chrome";
	String url="https://www.aa.com/homePage.do";
	
	@BeforeClass
	public void setUp() {
	    setUpDriver(browser, url);	
	}	
		
	@Test(priority=1)
	public void searchFlight() throws InterruptedException {
		
	//enter to and from
	sendText(driver.findElement(By.name("originAirport")), "DCA");
	sendText(driver.findElement(By.name("destinationAirport")), "JFK");	
	
	//click on calendar icon
	driver.findElement(By.xpath("//input[@id='aa-leavingOn']/following-sibling::button")).click();
	
	//grab element that holds month and year
	WebElement depMonth=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div"));
	
	while(!depMonth.getText().contains("October")) {
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		//when we click next element gets refreshed
		//if we want to perform this action we will get:
		//StaleElementReferenceException: stale element reference: element is not attached to the page document
		//we have to grab (fetch) this element again!
		depMonth=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div"));
	}
	
	//capturing all cells and loop and search for specific date
	List<WebElement> depCells=driver.findElements(By.xpath("//div[contains(@class,'group-first')]/table/tbody/tr/td"));
	for(WebElement cell:depCells) {
		String cellText=cell.getText();
		if(cellText.equals("18")) {
			cell.click();
			break;
		}
	}
	Thread.sleep(4000);
	
	//select arrival date as December 24
	//click on calendar
	driver.findElement(By.xpath("//input[@id='aa-returningFrom']/following-sibling::button")).click();
	
	WebElement arrMonth=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-right')]/div"));
	
	while(!arrMonth.getText().contains("December")) {
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		arrMonth=driver.findElement(By.xpath("//div[contains(@class,'group-last')]/div"));
		
	List<WebElement> arrCells=driver.findElements(By.xpath("//div[contains(@class,'ui-corner-right')]/table/tbody/tr/td"));
	for(WebElement cell:arrCells) {
		String cellText=cell.getText();
		
		if(cellText.equals("24")) {
			cell.click();
			Thread.sleep(4000);	
			break;
		}
	}
    }
	
	//click on search button
	driver.findElement(By.cssSelector("input[value='Search']")).click();
	}
		
	@Test(priority=2)
	public void verify() {
		String text=driver.findElement(By.tagName("a")).getText();
		String expected="Plan Travel";
		
    if(text.equals(expected)) {
    	System.out.println("Search is complite");
    }else {
    	System.out.println("Search is NOT complite");
    }
    
	}
		
		
		
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
		
		
		
		
		
	
}
