package com.class05Again;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement mailRadio=driver.findElement(By.id("sex-0"));
		System.out.println(mailRadio.isDisplayed()); //true
		System.out.println(mailRadio.isEnabled());   //true
		System.out.println(mailRadio.isSelected());  //false
		
		Thread.sleep(2000);
		//1 way of clicking on the element
		mailRadio.click();
		System.out.println(mailRadio.isSelected());  //true
		
		//1 way of clicking on the element -->preferred way
		List<WebElement> professionList=driver.findElements(By.name("profession"));
		System.out.println(professionList.size()); //2
		
		String valueToSelect="Automation Tester";
		
		for (WebElement profession:professionList) {	
			
			if (profession.isEnabled()) {
				
				//getting attribute of each element (if attribute is enable, get the value of it)
				String value=profession.getAttribute("value"); 
				System.out.println(value);     //Manual Tester  //Automation Tester
				if (value.equals(valueToSelect)) {
					profession.click();
				}
				
			}
		}
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
