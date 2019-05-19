package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
   //drop downs wrriten using select tag
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		//1 element
		WebElement dropDown=driver.findElement(By.id("continents"));
		dropDown.click();
		Thread.sleep(2000);
		
		Select obj=new Select(dropDown);
		//select value by index
		obj.selectByIndex(3); //Austarlia
		Thread.sleep(2000);
		
		//select by visibleText
		obj.selectByVisibleText("North America");
		
		//get allOptions
		List<WebElement> allOptions=obj.getOptions(); //returns you a list of elements
		System.out.println(allOptions.size());  //7
		
		
		
	}
}
