package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {
	
	//Open chrome browser
	//Go to “http://uitestpractice.com/”
	//Click on “Select” tab
	//Verify how many options available in the first drop down and then select “United states of America”
	//Verify how many options available in the second drop down and then select all.
	//Deselect China from the second drop down
	//Quit browser 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().fullscreen();
		driver.get("http://uitestpractice.com/");	
		driver.findElement(By.xpath("//a[text()='Select']")).click();
		
		//First drop down
		WebElement country=driver.findElement(By.id("countriesSingle"));
		Thread.sleep(2000);	
		
		Select select=new Select(country);
		List<WebElement> list1=select.getOptions();
		System.out.println("Number of available options in D1: : "+list1.size());
		
		select.deselectByVisibleText("United states of America");
		Thread.sleep(2000);	
			
		//Second drop down 
		
		WebElement country2=driver.findElement(By.id("dropdownMenu1"));
		Select select2=new Select(country2);
		List<WebElement> list2=select2.getOptions();
		System.out.println("Number of available options in D2"+list2.size());
		
		//check if we can select multiple options:
		if (select2.isMultiple()) {
		   for (int i=0; i<list2.size(); i++) {
		      select2.selectByIndex(i);
		      Thread.sleep(2000);	
		   }
		}
		//second way to click all
		for (WebElement option:list2) {
			option.click();
			Thread.sleep(2000);
		}
		select2.deselectByVisibleText("China");
		Thread.sleep(2000);	
		
		driver.quit();
	}
}
