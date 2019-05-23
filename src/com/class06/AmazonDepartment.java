package com.class06;

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
		
		WebElement depart=driver.findElement(By.xpath("//select[@name='url']"));
		Thread.sleep(2000);
		Select select=new Select(depart);
		List<WebElement> allOpt=select.getOptions();
		System.out.println("Toatal number of departmens available: "+allOpt.size());
		
		String expected="Computers";
		
		for (WebElement dep:allOpt) {
			String value=dep.getText();
			System.out.println(value);
			Thread.sleep(2000);
		}
		
		select.selectByVisibleText(expected);
		Thread.sleep(2000);
		driver.quit();		
		
		
	}
}
