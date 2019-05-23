package com.class05_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {
	 /*Open chrome browser
    Go to “https://www.toolsqa.com/automation-practice-form/”
    Fill out:
    First Name
    Last Name
    Check that sex radio buttons are enabled and select “Male”
    Check all Years of Experience radio buttons are clickable
    Date
    Select both checkboxes for profession
    Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
    Quit browser
  */
	public static void main(String[] args) throws InterruptedException {
	
		String firstName="John";
		String lastName="Smith";
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement firstN =driver.findElement(By.cssSelector("input[name='firstname']"));
		firstN.sendKeys(firstName);
		WebElement lastN=driver.findElement(By.cssSelector("input[name='lastname']"));
		lastN.sendKeys(lastName);
	  
		//Check that sex radio buttons are enabled and select “Male”
	    List<WebElement> radio=driver.findElements(By.id("sex-0"));
	    
	    String expectedSex="Male";
	    for (WebElement rad:radio) {
	    	if (rad.isEnabled() &&  rad.getAttribute("value").equals(expectedSex)) {
	    		rad.click();
	    		Thread.sleep(2000);
	    	}
	    }
	    // Check all Years of Experience radio buttons are clickable	
	    List<WebElement> yearsOfEx=driver.findElements(By.name("exp"));
		System.out.println(yearsOfEx.size());
		
		for (WebElement years:yearsOfEx) {	
			if (years.isEnabled()) {
				years.click();
				Thread.sleep(2000);
			}
		}
	  // Select both checkboxes for profession
		List<WebElement> autTool=driver.findElements(By.name("tool"));
		System.out.println(autTool.size());
	
		for (WebElement tool:autTool) {
			if (tool.isEnabled()) {
				String value2=tool.getAttribute("value");
				System.out.println(value2);
			//	tool.click();
				
				if (value2.equals("Selenium Webdriver")) {
					tool.click();
				}
	       }
		}
		Thread.sleep(2000);
		driver.quit();
 }
}
