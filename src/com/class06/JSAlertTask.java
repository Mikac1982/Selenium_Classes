package com.class06;

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
		
		driver.manage().window().fullscreen();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		//alert box
		driver.findElement(By.cssSelector("button[onclick*='Alert']")).click();
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		String alertTxt=alert.getText();
		String expected1="I am an alert box!";
		if (alertTxt.equals(expected1)) {
		    System.out.println(alertTxt+" text is present");
		}else {
			System.out.println(alertTxt+" text is NOT present. ");
		}
		alert.accept();
		
		//confirm box
		driver.findElement(By.cssSelector("button[onclick*='Confirm']")).click();
		Thread.sleep(2000);
		
		Alert confirmAlert=driver.switchTo().alert();
		String confirmTxt=confirmAlert.getText();
		String expected2="Press a button!";
		if (confirmTxt.equals(expected2)) {
			System.out.println(confirmTxt+" text is present");
		}else {
			System.out.println(confirmTxt+" text is NOT present");
		}
		confirmAlert.dismiss();
		
		//prompt box
		driver.findElement(By.cssSelector("button[onclick*='Prompt']")).click();
		Thread.sleep(2000);
		
		Alert promptAlert=driver.switchTo().alert();
		String promptTxt=promptAlert.getText();
		String expected3="Please enter your name";
		if (promptTxt.equals(expected3)) {
			System.out.println(promptTxt+" text is present");
		}else {
			System.out.println(promptTxt+" text is NOT present");
		}
		promptAlert.accept();
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
