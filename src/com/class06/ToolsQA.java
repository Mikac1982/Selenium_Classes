package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {
	 /*Open chrome browser
    Go to “https://www.toolsqa.com/automation-practice-form/”
    Fill out:
    First Name, Last Name
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
		driver.findElement(By.cssSelector("input[name^='first']")).sendKeys(firstName);
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys(lastName);
		Thread.sleep(2000);
		//sex radio buttons
		List<WebElement> list=driver.findElements(By.name("sex"));
		System.out.println(list.size());
		String valueToSelect="Male";
		
		for (WebElement sex:list) {
			if( sex.isEnabled()) {
				System.out.println(sex.getAttribute("value")+" is enabled");
			}else {
				System.out.println(sex.getAttribute("value")+" is NOT enabled");
			}
			String value=sex.getAttribute("value");
			if (value.equals(valueToSelect)) {
				sex.click();
			}
		}
		//Years of Experience radio buttons
		List<WebElement> list2=driver.findElements(By.name("exp"));
		System.out.println(list2.size());
		
		for (WebElement yearsOfEx:list2) {
			if (yearsOfEx.isEnabled()) {
				yearsOfEx.click();
				Thread.sleep(1000);
			}
		}
		//Date
		driver.findElement(By.id("datepicker")).sendKeys("May 19 2018");
		Thread.sleep(1000);
		
		//checkboxes for profession
		List<WebElement> profesion=driver.findElements(By.name("profession"));
		for (WebElement prof:profesion) {
			if (prof.isEnabled()) {
				prof.click();
			}
		}
		//Automation Tools checkboxes
		List<WebElement> tools=driver.findElements(By.name("tool"));
		String valueToSelect2="Selenium Webdriver";
		for (WebElement tool:tools) {
			if (tool.isEnabled()) {
				tool.click();
	            Thread.sleep(2000);
	            tool.click();
			}
			String value=tool.getAttribute("value");
		    if (value.equals(valueToSelect2)) {
			    tool.click();
			    Thread.sleep(2000);
		}	
		}
		
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
	}
	
}
