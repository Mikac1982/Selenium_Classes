package com.Riview01;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class QAToolsTask extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@name='profession']"));
		
		   //using for each loop
		for (WebElement profession : list) {
			if(profession.isEnabled()) {
				profession.click();
				Thread.sleep(2000);
			}
		}
		   //using iterator
		Iterator<WebElement> it=list.iterator();
		while(it.hasNext()) {
			it.next().click();
			Thread.sleep(2000);
		}
		
		
		driver.quit();
		
	}
}
