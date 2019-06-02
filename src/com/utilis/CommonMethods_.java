package com.utilis;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods_ {

	public static WebDriver driver;
	
	public static void setUpDriver(String browser, String url) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
			driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/drivers/geckodriver");
			driver=new FirefoxDriver();
		}else {
			System.out.println("Browser given is wrong");
		}
		
		driver.get(url);
	//	driver.manage().window().maximize();
	}
	
	public static void selectValueFromDD(WebElement element, String text) {
		
		Select select=new Select(element);
		List<WebElement> options=select.getOptions();
		for (WebElement option:options) {
			String optionText=option.getText();
			if (optionText.equals(text)) {
				select.selectByVisibleText(text);
				break;
			}else {
				System.out.println("Option with text "+text+" is not vailable");
			}
		}
	}
	
	public static void selectValueFromDD(WebElement element, int index) {
		
		Select select=new Select(element);
		List<WebElement> options=select.getOptions();
		
		if (options.size()>index) {
		    select.selectByIndex(index);
		}else {
			System.out.println("Invalid index has been passed");
		}
	}
	
	public static void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	//LOLA:
	public static void click(WebElement element) {			
		element.click();
			
		}
	
	public static void chooseDateFromCalendar(List<WebElement> list, String expectedValue) {
		
		List<WebElement> rows=(List<WebElement>) list;
		
		for (WebElement row:rows) {
			String rowText=row.getText();
			if(rowText.contains(expectedValue)) {
				row.click();
				
			}
		}
	
	
	
	
	
	
	}
}
