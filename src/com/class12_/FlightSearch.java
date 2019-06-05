package com.class12_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilis.CommonMethods;

public class FlightSearch extends CommonMethods {
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

    @Test
    public void searchFlight() throws InterruptedException {
    	//enter to and from
    	sendText(driver.findElement(By.name("originAirport")), "DCA");
    	sendText(driver.findElement(By.name("destinationAirport")), "JFK");
    	
    	//click on calendar icon
    	driver.findElement(By.xpath("//input[@id='aa-leavingOn']/following-sibling::button")).click();
    	
    	//grab element that holds month and year
        WebElement depMonth=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div"));
    	
    	while(!depMonth.getText().contains("October")){
    		driver.findElement(By.cssSelector("a[title='Next']")).click();
    		//after we click on Next we have to find this element again
    		//we have to grab this element again cause element/DOM got refresh  
    		depMonth=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div"));
    		Thread.sleep(4000);
    	}
    	
    	List<WebElement> depCells=driver.findElements(By.xpath("//div[contains(@class,'group-first')]/table/tbody/tr/td"));
    	for(WebElement cell:depCells) {
    	//	String cellText=cell.getText();
    		if(cell.getText().equals("18")) {
    			cell.click();
    			break;
    		}
    	}
    	
    	//select arrival date as December 24
    	//click on calendar
    	click(driver.findElement(By.xpath("//input[@id='aa-returningFrom']/following-sibling::button")));
    	
    	WebElement arrMonth=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-right')]/div"));
    	
    	while(!arrMonth.getText().contains("December")) {
    		click(driver.findElement(By.xpath("//a[@title='Next']")));
    		arrMonth=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-right')]/div"));
    	}
    	
    	List<WebElement> arrCells=driver.findElements(By.xpath("//div[contains(@class,'group-last')]/table/tbody/tr/td"));
    	for(WebElement cell:arrCells) {
    	//	String cellText=cell.getText();
    		if(cell.getText().equals("24")) {
    			cell.click();
    			break;
    		}
    	}
    Thread.sleep(3000);
    }
	
    @Test(priority=2)
    public void verify() {
    	click(driver.findElement(By.cssSelector("input[value='Search']")));
    	String text=driver.findElement(By.cssSelector("h1#aa-pageTitle")).getText();
        String expected="Choose flights";
        
        Assert.assertEquals(text, expected);
        System.out.println("Search was successfull");
        
        
        
    }
	@AfterClass()
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
