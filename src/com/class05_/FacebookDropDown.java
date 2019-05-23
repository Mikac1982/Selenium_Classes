package com.class05_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown {
   /*Open chrome browser
     Go to “https://www.facebook.com”
     Verify:
     month dd has 12 month options
     day dd has 31 day options
     year dd has 115 year options
     Select your date of birth    
     Quit browser 
    */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().fullscreen();
		driver.get("http://www.facebook.com");
		
		//MONTHS
		WebElement month=driver.findElement(By.id("month"));
	//	month.click();
		Select select=new Select(month);
		List<WebElement> monthList=select.getOptions();
		System.out.println("Month DD has "+(monthList.size()-1)+" options");
		select.selectByIndex(1);
		Thread.sleep(2000);
		
		//DAYS
		WebElement day=driver.findElement(By.id("day"));
		Select select2=new Select(day);
		List<WebElement> dayList=select2.getOptions();
		System.out.println("Day DD has "+(dayList.size()-1)+" options");
		select2.selectByIndex(4);
		Thread.sleep(2000);
		
		//YEARS
		WebElement year=driver.findElement(By.id("year"));
		Select select3=new Select(year);
		List<WebElement> yearList=select3.getOptions();
		System.out.println("Year DD has "+(yearList.size()-1)+" options");
		select3.selectByVisibleText("1982");
		Thread.sleep(2000);
		
		driver.quit();
	}
}
