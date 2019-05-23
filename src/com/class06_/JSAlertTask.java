package com.class06_;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertTask {
	//Open chrome browser
			//Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
			//Verify
			//alert box with text “I am an alert box!” is present
			//confirm box with text “Press a button!” is present
			//prompt box with text “Please enter your name” is present
			//Quit browser
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		//alert box
		driver.findElement(By.cssSelector("button[onclick*='Alert']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		String text="I am an alert box!";
		if (alertText.equals(text)) {
			System.out.println("Alert box text: "+alertText+" is present");
		}else {
			System.out.println("Alert box text: "+alertText+" is NOT present");
		}
		alert.accept();
		
		//confirm box
		driver.findElement(By.cssSelector("button[onclick*='Confirm']")).click();
		Thread.sleep(2000);
		Alert confirmAlert=driver.switchTo().alert();
		String confirmText=confirmAlert.getText();
		String text2="Press a button!";
		if (confirmText.equals(text2)) {
			System.out.println("Confirm box text: "+confirmText+" is present");
		}else {
			System.out.println("Confirm box text: "+confirmText+" is NOT present");
		}
		confirmAlert.dismiss();
		
		//prompt box
		driver.findElement(By.cssSelector("button[onclick*='Prompt']")).click();
		Thread.sleep(2000);
		Alert promptAlert=driver.switchTo().alert();
		String promptText=promptAlert.getText();
		String text3="Please enter your name";
		if (promptText.equals(text3)) {
			System.out.println("Prompt box text: "+promptText+" is present");
		}else {
			System.out.println("Prompt box text: "+promptText+" is NOT present");
		}
	//	promptAlert.sendKeys("Accepting the alert");
		promptAlert.accept();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
