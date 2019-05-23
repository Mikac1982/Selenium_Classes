package com.class05_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	/* Check if all Years of Experience radio buttons are clickable
	* -----------------------------------------------
	* Check if all Automation Tools checkboxes are clickable
	* and keep “Selenium WebDriver” option as selected
	*/
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement> yearsOfExo=driver.findElements(By.name("exp"));
		System.out.println(yearsOfExo.size());  //7
		
		for (WebElement years:yearsOfExo) {
			if(years.isEnabled()) {
				years.click();
				Thread.sleep(1000);
			}
		}
		List<WebElement> tools=driver.findElements(By.name("tool"));
		System.out.println(tools.size()); //3
		String expected="Selenium WebDriver";
		
		for (WebElement tool:tools) {
			if(tool.isEnabled()) {
				tool.click();
				Thread.sleep(1000);
				tool.click();
			}
			String value=tool.getAttribute("value");
			if (value.equals(expected)) {
				tool.click();
				Thread.sleep(2000);
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
