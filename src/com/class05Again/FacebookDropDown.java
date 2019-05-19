package com.class05Again;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDropDown {
   /*Open chrome browser
     Go to “https://www.facebook.com”
     Verify:
     month dd has 12 month options
     day dd has 31 day options
     year dd has 115 year options
     Select your date of birth    
     Quit browser 
    */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("http://www.facebook.com");
		
		
		
		
		
		
		
		
		
		
		
	}
}
