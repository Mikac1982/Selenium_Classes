package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownReview {

	public static void main(String[] args) throws InterruptedException {
		
		//if we do not set the proprety, we will get IllegalStateException
		                         //for FireFox
		//System.setProperty("webdriver.gecko.driver", "/Users/milenasibalic/Selenium/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		//if we pass wrong element type to select class, we will get UnexpectedTagNameException
	//	WebElement button=driver.findElement(By.cssSelector("button#submit"));
		
		
		//identify drop down with <select> tag
		WebElement contriesDD=driver.findElement(By.cssSelector("select#continents"));
		
		//Pass to the Select constructor
		Select select=new Select(contriesDD);
		//find how many options is available
		List<WebElement> allOptions=select.getOptions();
		System.out.println("Number of opptions in contry DD="+allOptions.size());
		
		System.out.println("------all options from countries DD----");
		Iterator<WebElement> it=allOptions.iterator();
		
		while(it.hasNext()) {
			String optionText= it.next().getText();
			System.out.println(optionText);
		}
		
		select.selectByVisibleText("Africa");
		Thread.sleep(2000);
		select.selectByIndex(5);
		Thread.sleep(2000);
	
		//deselect from SINGLE DD -> we will get UnsupportedOperationException:
		//you may only deslect options of multi-select
		//select.deselectByIndex(5);
		
		//working with MultiSelect
		WebElement commandsDD=driver.findElement(By.id("selenium_commands"));
		Select select1=new Select(commandsDD);
		List<WebElement> allOptions1=select1.getOptions();
		System.out.println("Number of opptions in commans1 DD="+allOptions1.size());
		//printing all options
		System.out.println("------all options from command DD----");
		for (int i=0; i<allOptions1.size(); i++) {
			String text=allOptions1.get(i).getText();
			System.out.println(text);
		}
		//checks if DD support multiple options
		if (select1.isMultiple()) {
			select1.selectByVisibleText("Navigation Commands");
			Thread.sleep(6000);
			select1.selectByIndex(2);
			select1.selectByIndex(3);
			select1.selectByIndex(4);
			
			Thread.sleep(2000);
		}
		//deselecting options from MULTIPLE select
		select1.deselectByIndex(2);
		select1.deselectByVisibleText("Navigation Commands");
		select1.deselectAll();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
