package com.Riview01;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class QATollsUsingName extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement> tool=driver.findElements(By.name("tool"));
		
		for (WebElement option:tool) {
			String value=option.getAttribute("value");
			if(option.isEnabled() && value.equals("QTP")) {
				option.click();
				Thread.sleep(1000);
			}
		//	String value=option.getAttribute("value");
		//	if (value.equals("QTP")) {
		//		option.click();
		//		Thread.sleep(1000);
		//	}
		}
		
		List<WebElement> sex=driver.findElements(By.name("sex"));
		Iterator<WebElement>it=sex.iterator();
		while(it.hasNext()) {
			it.next().click();
			Thread.sleep(1000);
		}
		
		
		
		
	//	driver.quit();
	}
}
