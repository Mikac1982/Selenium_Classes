package com.class11_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class JavaScriptDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="https:/www.toolsqa.com/automation-practice-form";
		setUpDriver("chrome", url);	
		Thread.sleep(3000);	
		
		//scroll down to the page
		
		//using Javascript we try to scroll DOWN the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)");  //pixels
		
		//scroll UP
//		js.executeScript("window.scrollBy(0,-400)");  //pixels
		
		//scroll directly to this element
//		WebElement label=driver.findElement(By.xpath("//label[text()='Automation Tool']"));
//		js.executeScript("arguments[0].scrollIntoView(true);", label);
		
		
		//click on QTP
		List<WebElement> toolsChBx=driver.findElements(By.name("tool"));
		String expected="QTP";
		
		for(WebElement cbox:toolsChBx) {
			if(cbox.isEnabled()) {
				
				if (cbox.getAttribute("value").equals(expected)) {
					if(!cbox.isSelected()) {
						cbox.click();
						break;
					}else {
						System.out.println("Checkbox is selected by default");
					}
				}
			}else {
				System.out.println("Checkbox is not enabled");
			}
		}
		
		//click on web element 
		WebElement el=driver.findElement(By.name("submit"));
		js.executeScript("arguments[0].click();", el);
		
		
		Thread.sleep(8000);	
		driver.quit();
		
	}
}
