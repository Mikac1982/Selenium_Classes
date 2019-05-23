package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement maleRadio=driver.findElement(By.id("sex-0"));
		
		System.out.println(maleRadio.isDisplayed());  //true
		System.out.println(maleRadio.isEnabled());    //true
		System.out.println(maleRadio.isSelected());   //false
		
		Thread.sleep(2000);
		//1 way of clicking on the element
		maleRadio.click();
		//once we clicked on it, it is selected ->true
		System.out.println(maleRadio.isSelected());   //true
		
		//2 way- preferred way!
		//if name returns you more than 1 element, we use findElements()
		String valueToSelect="Automation Tester";
		
		List<WebElement> professionList=driver.findElements(By.name("profession"));
		System.out.println(professionList.size()); //2
		
		for (WebElement profession :professionList) {
			Thread.sleep(2000);
			
			if (profession.isEnabled()) { //only if it's enabled we go inside
				
			String value=profession.getAttribute("value"); //we are looking for attribute ->value
			System.out.println(value);
			
				if (value.equals(valueToSelect)) { //if value match Automation Tester, it click
							profession.click();
				}
				
				Thread.sleep(2000);
			}
		}
		
		
		Thread.sleep(2000);
	//	driver.quit();
	}
}
