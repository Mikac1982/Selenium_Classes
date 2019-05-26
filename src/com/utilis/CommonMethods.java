package com.utilis;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	public static WebDriver driver;
	
	public static void setUpDriver(String browser, String url) {
		
		if (browser.equalsIgnoreCase("chrome")) {
		    System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");	
		    driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
		    System.setProperty("webdriver.gecko.driver", "src/drivers/geckodriver");
		    driver=new FirefoxDriver();
		}
		else {
			System.out.println("Browser given is wrong");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
/**
 * 	@author Syntax This method will select a specified value from a drop down
 * @parameter Select element, String text
 */
	public static void selectValueFromDD(WebElement element, String text) {
		
		Select select=new Select(element);
		List<WebElement> options=select.getOptions();
		boolean isSelected=false;
		for (WebElement option:options) {
			String optionText=option.getText();
			if (optionText.equals(text)) {
				select.selectByVisibleText(text); 
				System.out.println("Option with text "+text+" is selected");
				isSelected=true;
				break; //once we find the value we are looking for, we stop it; break;
			}
		}
		if(!isSelected) {
			System.out.println("Option with text "+text+" is NOT available");
		}
	}
	
	/**
	 * @autor Syntax
	 * This method will select a specified value from a drop down by its index
	 * @parm Select element, int index
	 */
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
/**
 * Method will accept alert
 * @throws NoAlertPresentException if alert is not present
 */
	public static void acceptAlert() {

		try {
		   Alert alert=driver.switchTo().alert();
		   alert.accept();
		}catch(NoAlertPresentException e) {
			System.out.println("Alert was not present");
		}
	}
/**
 * Method will dismiss alert
 * @throws NoAlertPresentException if alert is not present
 */	
	public static void dismissAlert() {
		try {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}catch(NoAlertPresentException e) {
			System.out.println("Alert was not present");
		}
	}
	/**
	 * Method will get text of an alert
	 * @throws NoAlertPresentException if alert is not present
	 * @return String text
	 */	
	public static String getAlertText() {
		
		try {
			Alert alert=driver.switchTo().alert();
			return alert.getText();
		}catch(NoAlertPresentException e) {
			System.out.println("Alert was not present");
			return null;
		}
	}
	/**
	 * Method that will switch control to the specify frame
	 * @paramater frame id or frame name
	 */	
	public static void switchToFrame(String idOrName) {
		try {
		    driver.switchTo().frame(idOrName);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	/**
	 * Method that will switch control to the specify frame
	 * @paramater frame element
	 */	
	public static void switchToFrame(WebElement element) { //method overloding
		try {
		    driver.switchTo().frame(element);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	/**
	 * Method that will switch control to the specify frame
	 * @paramater frame index
	 */
	public static void switchToFrame(int index) { //method overloding
		try {
		    driver.switchTo().frame(index);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}


	
}
