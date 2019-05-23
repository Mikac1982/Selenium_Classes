package com.class05_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		//1 element
		WebElement continentDD=driver.findElement(By.id("continents"));
		//continentDD.click();
		
		Select obj=new Select(continentDD);
		//select value by index
		obj.selectByIndex(3);
		//select by visibleText
		obj.selectByVisibleText("North America");
		//select by Value
		
		
		//get allOptions
		List<WebElement> allOption=obj.getOptions(); //returns you a list of elements
		System.out.println(allOption.size());        //7
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}
}
