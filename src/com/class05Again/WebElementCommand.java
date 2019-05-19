package com.class05Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

	public static String userName="Tester";
	public static String password="test";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver"); 
		WebDriver driver= new ChromeDriver();
		
		//maximize window
		driver.manage().window().fullscreen();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		//driver find 1 element--> returns 1 WebElement and we are storing it in variable type of WebElement
		//storing userName text box inside variable: 
		WebElement userNameTxt=driver.findElement(By.cssSelector("input[id*='username']"));
		userNameTxt.sendKeys(userName);
		Thread.sleep(2000);
		userNameTxt.clear();  //clear the previous action 
		//sendKeys() --> will append text
		userNameTxt.sendKeys(password); 
		
		//storing password text box inside variable:
		WebElement pwdTxt=driver.findElement(By.cssSelector("input[type='password']"));
		pwdTxt.clear();
		pwdTxt.sendKeys("test");
		
		//click on the Login button
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		//verify logo is displayed:
		boolean isDisplayed=driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("WebOrder logo is displayed");
		}else {
			System.out.println("WebOrder logo is NOT displayed");
		}
		
		//capture welcome element
		WebElement welcome=driver.findElement(By.xpath("div[class='login_info']"));
		String value=welcome.getText();
		if (value.contains(userName)) {
			System.out.println(userName+" is loggded in. Test case PASS");
		}System.out.println(userName+" is loggded in. Test case FAIL");
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
