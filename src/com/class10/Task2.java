package com.class10;

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
	public static void main(String[] args) {
		
	String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";	
	setUpDriver("chrome", url);	
		
	driver.findElement(By.cssSelector("input[id*='name']")).sendKeys("Tester");
	driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("test");	
	driver.findElement(By.cssSelector("input[value='Login']")).click();	
	
	List<WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
	List<WebElement> cols=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr[1]/th"));
	
	//Verify customer “Susan McLaren” is present in the table
	String expectedValue="Susan McLaren";
	
	for (int i=1; i<=rows.size(); i++) {
		String rowsText=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]")).getText();
		
		if (rowsText.contains(expectedValue)) {
			driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]/td[1]")).click();
			System.out.println("Expected value is present");
		}
	}
	
	driver.quit();
	
	}
}
