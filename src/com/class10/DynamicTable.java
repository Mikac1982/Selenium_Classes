package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utilis.CommonMethods;

public class DynamicTable extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
	String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx";
	setUpDriver("chrome", url);
	
	sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester");
	sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
	driver.findElement(By.cssSelector("input[value='Login")).click();
	
	//get number of rows and columns
	List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr"));
	List<WebElement> cols=driver.findElements(By.xpath("rowTest"));
	
	//click on check box next to Susan McLaren
	String expectedValue="Canada";
	
	for (int i=1; i<=rows.size(); i++) {
		String rowTest=driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr["+i+"]")).getText();
		
		if (rowTest.contains(expectedValue)) {
			driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr["+i+"]/td[1]")).click();
		}
	}
	
	Thread.sleep(2000);
	driver.quit();
	
	}
}
