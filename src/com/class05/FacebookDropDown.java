package com.class05;

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
		Select select1=new Select(month);
		List<WebElement> monthList=select1.getOptions();
		int size=monthList.size()-1;
		System.out.println("Total number of month options available: "+size);
		select1.selectByIndex(1);
		
		//DAYS
		WebElement day=driver.findElement(By.id("day"));
		Select select2=new Select(day);
		List<WebElement>listDay=select2.getOptions();
		int size2=listDay.size()-1;
		System.out.println("Total number of day options available: "+size2);
		select2.selectByVisibleText("4");
		
		//MONTH
		WebElement year=driver.findElement(By.id("year"));
		Select select3=new Select(year);
		List<WebElement> yearList=select3.getOptions();
		int size3=yearList.size()-1;
		System.out.println("Total number of year options available: "+size3);
		select3.selectByVisibleText("1982");;
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
