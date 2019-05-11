package com.class02Again;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException{
		/* Syntax Page URL Verification:
	     Open chrome browser
	     Navigate to “https://www.syntaxtechs.com/”
	     Navigate to “https://www.google.com/”
	     Navigate back to Syntax Technologies Page
	     Refresh current page
	     Verify url contains “Syntax”
	   */

		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();		
		
		driver.navigate().to("http://www.syntaxtechs.com");
		Thread.sleep(1000); 
		driver.navigate().to("http:google.com");
		Thread.sleep(1000); 
		driver.navigate().back();
		Thread.sleep(1000); 
		driver.navigate().refresh();
		
		String url=driver.getCurrentUrl();    //https://syntaxtechs.com/ do not contain Syntax
		System.out.println(url);
		if (url.contains("Syntax")) {
			System.out.println(url+" contains Syntax");
		}else {
			System.out.println(url+" do not contain Syntax");
		}
		driver.quit();
		
		//	System.out.println(driver.getTitle()); this is for title, not the URL -> Not The Same!
		//	String title=driver.getTitle();   //Home - Syntax Technologies

//			if (title.contains("Syntax")) {
//				System.out.println("The url contains Syntax");
//			}else {
//				System.out.println("The url does not contain Syntax");
//			}
	}
}
