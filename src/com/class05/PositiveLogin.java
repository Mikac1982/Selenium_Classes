package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveLogin {
	//Open chrome browser
	//Go to “https://www.saucedemo.com/”
	//Enter valid username and valid password and click login
	//Verify robot icon is displayed
	//Verify “Products” text is available next to the robot icon
	
	public static void main(String[] args) throws InterruptedException {
	
		String userName="standard_user";
		String password="secret_sauce";
		
		System.setProperty("webdriver.chrome.driver", "/Users/milenasibalic/Selenium/chromedriver");	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		//login to application
		driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[starts-with(@value,'LOGI')]")).click();
		Thread.sleep(2000);
		
		//login verification
		boolean logo=driver.findElement(By.xpath("//div[@class='peek']")).isDisplayed();
		//
		if (logo) {
			System.out.println("Robot icon is displayed");
		}else {
			System.out.println("Robot icon is NOT displayed");
		}
		//verify product text
		WebElement product=driver.findElement(By.xpath("div.product_label"));
		boolean displayP=product.isDisplayed();
		String productText=product.getText();
		
		String expectedText="Products";
		
		if(displayP && productText.equals(expectedText)) {
			System.out.println("Element is displayed and text is "+productText);
		}else {
			System.out.println("Element is NOT displayed or text is NOT "+productText);
		}
	//	if (product) {
	//		System.out.println("Products” text is available");
	//	}else {
	//		System.out.println("Products” text is NOT available");
	//	}
		
		//driver.close();
	}
}
