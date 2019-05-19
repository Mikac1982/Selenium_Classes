package com.class04Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSMercury {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("mika");
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys("sibalic");
		driver.findElement(By.cssSelector("input[name$='one']")).sendKeys("202-333-4544");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("sibalic@gmail.com");
		driver.findElement(By.cssSelector("input[name$='dress1']")).sendKeys("123 kalorama rd");
		driver.findElement(By.cssSelector("input[name*='it']")).sendKeys("washington");
		driver.findElement(By.cssSelector("input[name^='stat']")).sendKeys("dc");
		driver.findElement(By.cssSelector("input[name$='Code']")).sendKeys("20009");
		driver.findElement(By.cssSelector("input#email")).sendKeys("milena123");
		driver.findElement(By.cssSelector("input[name$='ssword']")).sendKeys("pass");
		driver.findElement(By.cssSelector("input[name^='confirm']")).sendKeys("pass");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='image']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
