package com.Riview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utilis.CommonMethods;

public class FacebookAgain extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://www.facebook.com");		
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("mika");
		driver.findElement(By.name("lastname")).sendKeys("sibalic");
		driver.findElement(By.id("u_0_o")).sendKeys("pass");
		
		WebElement days= driver.findElement(By.xpath("//select[@title='Day']"));
		Select day=new Select(days);
		day.selectByIndex(3);
		Thread.sleep(1000);
		
		WebElement years=driver.findElement(By.id("year"));
		Select year=new Select(years);
		year.selectByVisibleText("2000");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
}
