package com.class10_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class Task2 extends CommonMethods{
	//Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
	//	Login to the application
	//	Verify customer “Susan McLaren” is present in the table
	//	Click on customer details
	//	Update customers last name
	//	Verify updated customers name is displayed in table
	//	Close browser
	
	public static void main(String[] args) throws InterruptedException {
		
		String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";	
		setUpDriver("chrome", url);	
		
		driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("Tester");
		sendText(driver.findElement(By.cssSelector("input[id*='pass']")), "test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr/th"));
		
//		Verify customer “Susan McLaren” is present in the table
		String expectedValue="Susan McLaren";
		
		for (int i=1; i<=rows.size(); i++) {
			String rowText=driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr["+i+"]")).getText();
			
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr[6]/td[1]")).click();
				System.out.println("Expected value is present");
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}
