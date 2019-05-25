package com.Riview01;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class QAToolsTest extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-form/");
		
		   //using css selector:
		List<WebElement> list=driver.findElements(By.cssSelector("input[id^='exp-1']"));
		
		int i=0;
		for (WebElement ele:list) {
			i++;
			if(ele.isEnabled()) {
				ele.click();
				Thread.sleep(1000);
				if(i==4) {  //at 4th element we stop clicking
					break;
				}
			}
		}
		
		    //using xpath: 
		List<WebElement> radios=driver.findElements(By.xpath("//input[@name='exp']"));
		
		Iterator<WebElement> it=radios.iterator();
		while(it.hasNext()) {
			it.next().click();
			Thread.sleep(1000);
		}
		
		driver.close();
		
		
	}
}
