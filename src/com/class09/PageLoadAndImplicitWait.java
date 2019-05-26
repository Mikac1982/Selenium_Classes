package com.class09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadAndImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		//PAGE LOAD TIMEOUT:
		//using driver, we try to manage timeouts of page loading (how much, and type-SECONDS...)
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//IMPLICIT WAIT
		//driver will wait additional 20 sec, if find it before, in 10 for example, the rest of time is dismissed
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cnn.com");
		
		driver.findElement(By.linkText("World")).click();
		boolean isDisplayed=driver.findElement(By.xpath("//h1[text()='World']")).isDisplayed();
		if (isDisplayed) {
			System.out.println("Element is present");
		}else {
			System.out.println("Element is NOT present");
		}
		
		driver.quit();
		
	}
}
