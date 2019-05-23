package com.class02_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		//getTitle();
		System.out.println(driver.getTitle()); //print actual title of a web page -> Google
		String title=driver.getTitle();
		if (title.equalsIgnoreCase("google")) {
			System.out.println("This is the right title");
		}else {
			System.out.println("Sorry, thi is not the right title");
		}
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());  //Facebook - Log In or Sign Up
		String title2=driver.getTitle();
		
		if (title2.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("This is the right title");
		}else {
			System.out.println("Sorry, this is not the right title");
		}
		
	}
}
