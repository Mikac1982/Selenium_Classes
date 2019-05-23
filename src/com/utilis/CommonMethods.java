package com.utilis;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

	public static WebDriver driver;
	
	public static void setUpDriver(String browser, String url) {
		
		if (browser.equalsIgnoreCase("chrome")) {
		    System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		    driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
		    System.setProperty("webdriver.gecko.driver", "/Users/milenasibalic/Selenium/geckodriver");
		    driver=new FirefoxDriver();
		}
		else {
			System.out.println("Browser given is wrong");
		}
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public static void selectValueFromDD(WebElement element, String text) {
		
		Select select=new Select(element);
		List<WebElement> options=select.getOptions();
		
		for (WebElement option:options) {
			String optionText=option.getText();
			if (optionText.equals(text)) {
				select.selectByVisibleText(text); 
				break; //once we find the value we are looking for, we stop it; break;
			}else {
				System.out.println("Option with text "+text+" is NOT available");
			}
		}
	}
	
	public static void selectValueFromDD(WebElement element, int index) { //method overloading
		
		Select select=new Select(element);
		List<WebElement> options=select.getOptions();
		
		if (options.size()>index) {
			select.selectByIndex(index);
		}else {
			System.out.println("Invalid index has been passed");
		}
		select.deselectByIndex(index);
		
	}
	
	public static void sentText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	
}
