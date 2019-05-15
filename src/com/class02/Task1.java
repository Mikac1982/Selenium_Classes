package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
/* Amazon Page Title Verification:
   Open chrome browser
   Go to “https://www.amazon.com/”
   Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
 */
	
	public static void main(String[] args) {
	
		//opening chrome driver
	System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
	WebDriver driver=new ChromeDriver();	
		
	driver.get("https://www.amazon.com");
	System.out.println(driver.getTitle()); //Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
	String title=driver.getTitle();
	
	if (title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
		System.out.println("valid title");
	}else {
		System.out.println("sorry, invalid title");
	}
		
	driver.close();	
		
	}
	
	
	
	
	
	
	
	
}
