package com.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.spicejet.com/");
		
		WebElement drop=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(drop);
		Thread.sleep(2000);
		s.selectByIndex(2);
		s.selectByVisibleText("AED");
		
		//clicking on adults drop down
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		String text1=driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(text1);
		
		    //using for loop
		for (int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(1000);
		}
		   //using while loop
//		int i=1;
//		while(i<5) {
//			driver.findElement(By.id("hrefIncAdt")).click(); //4 times
//			i++;
//		}

		//click on done button
		driver.findElement(By.id("btnclosepaxoption")).click(); 
		
		String text2=driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(text2);
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
