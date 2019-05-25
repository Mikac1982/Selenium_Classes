package com.Practice;

import org.openqa.selenium.By;

import com.utilis.CommonMethods;

public class SingleWindowPopUp extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://www.seleniumeasy.com/test/window-popup-modal-demo.html");	
		
		driver.findElement(By.xpath("//a[text()='  Follow On Twitter ']")).click();
		Thread.sleep(1000);
		
		
		
		
		
	}
}
