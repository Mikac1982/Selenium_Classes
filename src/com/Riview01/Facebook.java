package com.Riview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utilis.CommonMethods;

public class Facebook extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://www.facebook.com");	
		
		driver.findElement(By.cssSelector("input[name^='first']")).sendKeys("jessie");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("smith");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_h")).sendKeys("202-333-444");
		driver.findElement(By.cssSelector("input[data-type*='pass']")).sendKeys("pass");
		Thread.sleep(1000);
		
		//MONTH
		WebElement month=driver.findElement(By.cssSelector("select[name$='_month']"));
		Select select=new Select(month);
		select.selectByVisibleText("Jan");
		Thread.sleep(1000);
		
		//DAY
		WebElement day=driver.findElement(By.id("day"));
		Select select2=new Select(day);
		select2.selectByIndex(4);
		Thread.sleep(1000);
		
		//YEAR
		WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select select3=new Select(year);
		select3.selectByVisibleText("1982");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
