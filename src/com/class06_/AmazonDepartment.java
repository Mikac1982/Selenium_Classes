package com.class06_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDepartment {
	//Amazon Department List Verification
		//Open chrome browser
		//Go to “http://amazon.com/”
		//Verify how many department options available.
		//Print each department
		//Select Computers
		//Quit browser
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
			WebDriver driver=new ChromeDriver();
			
		//	driver.manage().window().fullscreen();
			driver.get("https://www.amazon.com");
			
		      	//Verify how many department options available.
			WebElement list=driver.findElement(By.id("searchDropdownBox"));
			Select select=new Select(list);
			List<WebElement> allDepartments=select.getOptions();
			System.out.println("Total number of available departments: "+allDepartments.size());
			
			    //Print each department
			for (WebElement each:allDepartments) {
				String value=each.getText();
				System.out.println(value);
			}
			
			  //Select Computers
			select.selectByVisibleText("Computers");
			
			Thread.sleep(3000);
			driver.quit();
		}
}
