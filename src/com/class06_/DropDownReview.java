package com.class06_;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownReview {

	public static void main(String[] args) throws InterruptedException {
		
		//if we do not set the property we will get IllegalStateException:
	//	System.setProperty("webdriver.gecko.driver", "/Users/milenasibalic/Selenium/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		//if we pass wrong element type to the select class, we will get UnexpectedTagNameException
		//we passed element type of button, not drop down --> can not work; has to be DD element
	//	WebElement button=driver.findElement(By.cssSelector("button#submit"));
	
		      //identify DropDown element with <select>tag
		WebElement contriesDD=driver.findElement(By.id("continents"));
		     //pass that element to the Select Class constructor
		Select select=new Select(contriesDD); 
		//find how many options is available
		List<WebElement> allOptions=select.getOptions();
		System.out.println("Number of options in country DD is: "+allOptions.size()); //7
		
		System.out.println("-----------all options from country DD--------");
		Iterator<WebElement> it=allOptions.iterator();
		while (it.hasNext()) {
			String optionText=it.next().getText();
			System.out.println(optionText);
		}
		select.selectByVisibleText("Africa");
		Thread.sleep(2000);
		select.selectByIndex(5);
		//deselect from SINGLE DD --> we will get UnsupportedOperationException:
	//	select.deselectByIndex(5);    //--> You may only deselect options of a multi-select
		
		
		//working with MULTISELECT: 
		WebElement commandDD=driver.findElement(By.id("selenium_commands"));
		Select select1=new Select(commandDD);
		List<WebElement> allOptions1=select1.getOptions();
		System.out.println("Number of options in command DD is: "+allOptions1.size()); //5
		    //printing all options   
		System.out.println("-----------all options from command DD--------");
		for(int i=0; i<allOptions1.size(); i++) {
			String text=allOptions1.get(i).getText();
			System.out.println(text);
		}
		
		
		//check if your Drop Down support multiple options
		if (select1.isMultiple()) {
			select1.selectByVisibleText("Navigation Commands");
			
			select1.selectByIndex(2);
			select1.selectByIndex(3);
			select1.selectByIndex(4);
			Thread.sleep(2000);
		}
		//deselecting options from MULTIPLE select/ListBox
		select1.deselectByIndex(2);
		Thread.sleep(2000);
		select1.deselectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		select1.deselectAll(); //to deselcet all options
		
		
		Thread.sleep(4000);
		driver.quit();
	}
}
