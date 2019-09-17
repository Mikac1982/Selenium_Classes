package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolsQA {
   /*Open chrome browser
      Go to “https://www.toolsqa.com/automation-practice-form/”
      Fill out:
      First Name
      Last Name
      Check that sex radio buttons are enabled and select “Male”
      Check all Years of Experience radio buttons are clickable
      Date
      Select both checkboxes for profession
      Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
      Quit browser
    */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/milenasibalic/Selenium/geckodriver");	
		WebDriver driver=new FirefoxDriver();
		
		//driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement firstName =driver.findElement(By.cssSelector("input[name='firstname']"));
		firstName.sendKeys("milena");
		WebElement lastName=driver.findElement(By.cssSelector("input[name='lastname']"));
		lastName.sendKeys("sibalic");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
