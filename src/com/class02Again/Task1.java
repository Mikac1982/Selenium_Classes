package com.class02Again;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		/* Amazon Page Title Verification:
		   Open chrome browser
		   Go to “https://www.amazon.com/”
		   Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
		 */

		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();	
		driver.get("http://amazon.com");
		
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		
		if (title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("This is right title");
		}else {
			System.out.println("This is not the rights title");
		}
		
		
		
		
		
	}
}
