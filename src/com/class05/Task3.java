package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilis.CommonMethods;

public class Task3 extends CommonMethods{
   /* Check if all Years of Experience radio buttons are clickable
	* -----------------------------------------------
	* Check if all Automation Tools checkboxes are clickable
	* and keep “Selenium WebDriver” option as selected
	*/
	
	public static void main(String[] args) throws InterruptedException {
	
		setUpDriver("chrome","https://www.toolsqa.com/automation-practice-form/");
	//	System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
	//	WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().fullscreen();
	//	driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement> yearsOfEx=driver.findElements(By.name("exp"));
		System.out.println(yearsOfEx.size());
		
		for (WebElement years:yearsOfEx) {	
			if (years.isEnabled()) {
				years.click();
				Thread.sleep(2000);
		//		String value=years.getAttribute("value");
		//		System.out.println(value+" is clickable");
			}
		}
		
		List<WebElement> autTool=driver.findElements(By.name("tool"));
		System.out.println(autTool.size());
	
		for (WebElement tool:autTool) {
			if (tool.isEnabled()) {
				String value2=tool.getAttribute("value");
				System.out.println(value2);
				//tool.click();
				
				if (value2.equals("Selenium Webdriver")) {
					tool.click();
				}
			}
		}
	
		
	}
}
