package com.class07;

import org.openqa.selenium.By;

import com.utilis.CommonMethods;

public class Test extends CommonMethods{

	public static void main(String[] args) {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");	
	    driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='iframe_a']")));
		
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tom");
	    
	    boolean Switch=driver.findElement(By.xpath("//h2[text()='SwitchTo']")).isDisplayed();;
	    if (Switch==true) {
	    	driver.close();
	    }
	    
	    
	    
	    
	    
	}
}
