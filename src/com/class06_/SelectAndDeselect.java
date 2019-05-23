package com.class06_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {
	//Open chrome browser
	//Go to “http://uitestpractice.com/”
	//Click on “Select” tab
	//Verify how many options available in the first drop down and then select “United states of America”
	//Verify how many options available in the second drop down and then select all.
	//Deselect China from the second drop down
	//Quit browser 

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().fullscreen();
		driver.get("http://uitestpractice.com/");	
		
	//	driver.findElement(By.xpath("//a[text()='Select']")).click();
		driver.findElement(By.linkText("Select")).click();;
		
		      //first Single drop down
		WebElement countriesDD=driver.findElement(By.id("countriesSingle"));
		Select select=new Select(countriesDD);
		List<WebElement>allOptions=select.getOptions();
		System.out.println("Total number of available options in first DD: "+allOptions.size());
		Thread.sleep(3000);
		select.selectByVisibleText("United states of America");
		
		    //second Multiple drop down
		WebElement multipleDD=driver.findElement(By.id("countriesMultiple"));
		Select select2=new Select(multipleDD);
		List<WebElement> allOptions2=select2.getOptions();
		System.out.println("Total number of available options in second DD: "+allOptions2.size());
		
		//check if we can select multiple options:
		if (select2.isMultiple()) {
		    for (WebElement all:allOptions2) {
			    all.click();
			    Thread.sleep(1000);
		   }
		}
		select2.deselectByVisibleText("China");
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
