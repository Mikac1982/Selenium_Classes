package com.class10;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;

import com.utilis.CommonMethods;

public class FluentWaitDemo extends CommonMethods{

	public static void main(String[] args) {
		
        setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		
		String text="Dynamic Controls";
		driver.findElement(By.linkText(text)).click();
		
		FluentWait wait=new FluentWait(driver);
		//how often we want to check
		wait.withTimeout(30, TimeUnit.SECONDS);
		wait.pollingEvery(1, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		
		
		String buttonXpath="//button[text()='Enable']";
		driver.findElement(By.xpath(buttonXpath)).click();
		
		
	}
}
