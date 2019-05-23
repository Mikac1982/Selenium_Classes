package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static String userName="Tester";
	public static String password="test";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		//to maximize a window
		driver.manage().window().fullscreen();
	    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		Thread.sleep(2000);
	
		//find returns 1 element, we store it inside variable->this variable holds entire box
		//
		WebElement userNameTxt=driver.findElement(By.cssSelector("input[id*='username']"));
		Thread.sleep(2000);
		userNameTxt.sendKeys("John");
		Thread.sleep(2000);
		userNameTxt.clear();
		//sendKeys--> will append text
		userNameTxt.sendKeys(userName);
		
		//storing password text box inside variable
		WebElement pwdTxt=driver.findElement(By.cssSelector("input[type='password']"));
		pwdTxt.clear();
		pwdTxt.sendKeys(password);
		
		//click on the Login button
		driver.findElement(By.cssSelector("input[value='Login']")).click();;
		
		//verify logo is displayed
		boolean isDisplayed=driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("WebOrder logo is displayed");
		}else {
			System.out.println("WebOrder logo is NOT displayed");
		}
		
		//verify that specific user is Login
		//capture welcome element
		WebElement welcome=driver.findElement(By.xpath("//div[@class='login_info']"));
		//to get value of any attribute of the element
		System.out.println(welcome.getAttribute("class")); 
		
		//text returns string 
		String value=welcome.getText();
		
		if (value.contains(userName)) {
			 System.out.println(userName+" is logged in. Test case is PASS ");
		}else {
			 System.out.println(userName+" is not logged in. Test case is not PASS ");
		 }
		
		Thread.sleep(2000);
		driver.quit();
	}
}
