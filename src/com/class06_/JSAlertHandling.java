package com.class06_;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://uitestpractice.com/");
		
		     //click on switch link and alert button
		driver.findElement(By.linkText("Switch to")).click();
		driver.findElement(By.id("alert")).click();
		Thread.sleep(2000);
		
		//if we do not handle alert, we will get UnhandledAlertException:
	    //-->unexpected alert open:
	    //driver.findElement(By.id("confirm")).click();
		
		//switch focus to the alert window
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		//click on confirm button
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		
		Alert confirmAlert=driver.switchTo().alert();
		//getting text of an alert
		String alertText=confirmAlert.getText();
		System.out.println("Text of confirm alert: "+alertText);
		confirmAlert.dismiss();
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		Alert promptAlert=driver.switchTo().alert();
		//getting text of an alert
		String promptText=promptAlert.getText();
		System.out.println("Text of prompt alert: "+promptText);
	//	promptAlert.sendKeys("Hello");  //there is a bug, doesn't work now!
		Thread.sleep(2000);
		promptAlert.accept();
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
