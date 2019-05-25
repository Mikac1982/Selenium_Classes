package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class ToolsQA extends CommonMethods{
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
		String firstName="milena";
		String lastName="sibalic";
		
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name^='first']")).sendKeys(firstName);
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys(lastName);
		Thread.sleep(1000);
		
		List<WebElement> sex=driver.findElements(By.name("sex"));
		String wantedSex="Male";
		for (WebElement option:sex) {
			if (option.isEnabled() && option.getAttribute("value").equals(wantedSex)) {
				option.click();
				Thread.sleep(1000);
			}   
		}
		 // Check all Years of Experience radio buttons are clickable	
		List<WebElement> radio=driver.findElements(By.name("exp"));
		for (WebElement option:radio) {
			if (option.isEnabled()) {
				option.click();
				Thread.sleep(1000);
			}
		}
		//date
		driver.findElement(By.id("datepicker")).sendKeys("23.May 2019");
		Thread.sleep(1000);
		
		// Select both checkboxes for profession
		List<WebElement> profession=driver.findElements(By.name("profession"));
		System.out.println("Number of check boxes: "+profession.size());
		for (WebElement opt: profession) {
			if (opt.isEnabled()) {
				opt.click();
				Thread.sleep(1000);
			}
		String wantedValue="Selenium Webdriver";	
		String value=opt.getAttribute("value");
		if (value.equals(wantedValue)) {
			opt.click();
			Thread.sleep(1000);
		}
		}
		
		Thread.sleep(1000);
		driver.quit();
		
	}
}
