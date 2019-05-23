package com.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpidiaDD {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.expedia.com/");
		
	//	driver.findElement(By.cssSelector("button.on")).click();
		WebElement from=driver.findElement(By.id("package-origin-hp-package"));
		from.click();
		Thread.sleep(2000);
		
		from.sendKeys("MIA");
		for (int i=0; i<2; i++) {
		      from.sendKeys(Keys.ARROW_DOWN);
		}
		from.sendKeys(Keys.ENTER);
		
		WebElement destination=driver.findElement(By.id("package-destination-hp-package"));
		destination.click();
		Thread.sleep(2000);
		destination.sendKeys("NEW");
		for (int i=0; i<4; i++) {
		      destination.sendKeys(Keys.ARROW_DOWN);
		}
		destination.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("package-departing-hp-package")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class*='-date start']")).click();
		
		driver.findElement(By.cssSelector("button[class$='-date start']")).click();
		
		driver.findElement(By.cssSelector("button[class*='date end']")).click();
		driver.findElement(By.cssSelector("button[aria-expanded='true']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("search-button-hp-package"));
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
