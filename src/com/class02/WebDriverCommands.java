package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		//opening chrome driver
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();	
		
		driver.get("http://google.com");
		
	    //driver.getTitle();  no parameters needed
		System.out.println(driver.getTitle());  //returns back String -Google; always have to print this
		String title=driver.getTitle();
		
		if(title.equalsIgnoreCase("google")) {
			System.out.println("this is the right title");
		}
		else {
			System.out.println("sorry this is not the title");
		}
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		String title2=driver.getTitle();
		                            //we need full title, entire!
		if (title2.equalsIgnoreCase("Facebook - Log In or Sign Up")) { // Facebook - Log In or Sign Up
			System.out.println("this is the right title");
		}else {
			System.out.println("sorry, this is not the right title");
		}
		
		driver.close();
		
		
		
		
		
	}
}
