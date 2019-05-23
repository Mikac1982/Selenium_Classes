package com.utilis;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodsReuse {
  
	public static WebDriver driver;
	public static Select select;
	
	public static void sendKeys(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	public static void browserSetUp(String browser, String URL) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/milenasibalic/Selenium/geckodriver");
			driver=new FirefoxDriver();
		}
		driver.get(URL);
	}
	
	public static void selectByValue(WebElement element, String value) {
		Select select=new Select(element);
		List<WebElement> list=select.getOptions();
		
		for (WebElement option:list) {
			String optionText=option.getText();
			if (optionText.equals(value)) {
				select.selectByValue(value);
			}
		}
	}
	
	public static void selectByIndex(WebElement element, int index) {
		 select=new Select(element);
		 List<WebElement> options=select.getOptions();

			if (options.size()>index) {
				select.selectByIndex(index);
			}else {
				System.out.println("Invalid index has been passed");
			}
			select.deselectByIndex(index);
			
		}
		
		
		
	}
	
	
	
	
	
	

