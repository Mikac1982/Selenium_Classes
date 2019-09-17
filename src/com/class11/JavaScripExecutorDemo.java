package com.class11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class JavaScripExecutorDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	
	String url="https:/www.toolsqa.com/automation-practice-form";
	setUpDriver("chrome", url);	
	Thread.sleep(3000);
		
	//1. downcasting
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//scroll down the page	
	//2. using method .executeScript()
	js.executeScript("window.scrollBy(0,550)");
	Thread.sleep(2000);
	
	//scroll UP
//	js.executeScript("window.scrollBy(0, -400)");
//	Thread.sleep(2000);
	
	//scroll directly to this element
//	WebElement label=driver.findElement(By.xpath("//label[text()='Automation Tool']"));
//	js.executeScript("arguments[0].scrollIntoView(true);",label);
	
	
	//click on QTP
	List<WebElement> toolSCB=driver.findElements(By.name("tool"));
	for(WebElement cbox:toolSCB) {
		if (cbox.isEnabled()) {
			
			String expected="QTP";
			if (cbox.getAttribute("value").equals(expected)) {
				if(!cbox.isSelected()) {
	//				cbox.click();
					break;
				}else {
					System.out.println("Check box is selected by default");
				}
			}
		}else {
			System.out.println("Check box is not enabled");
		}
	}
	
	//click on web element 
	WebElement el=driver.findElement(By.name("submit"));
	js.executeScript("arguments[0].click();", el);
	

	
	Thread.sleep(7000);
	driver.quit();
	}
}
